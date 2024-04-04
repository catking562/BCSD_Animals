package util;

import taewookim.Animal;

import java.util.ArrayList;
import java.util.Iterator;

public class World extends Thread {

    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Animal> addinganimals = new ArrayList<>();
    private boolean isupdating = false;
    private boolean isend = false;

    private Long runsec = 1000L;
    private final int maxanimals = 5000;

    public Iterator<Animal> getAnimals() {
        return animals.iterator();
    }

    public World(int frame) {
        runsec/=frame;
    }

    public void addAnimal(Animal animal) {
        if(animal==null) {
            return;
        }
        if(isupdating) {
            addinganimals.add(animal);
        }else {
            animals.add(animal);
        }
    }

    public void update() {
        isupdating = true;
        for(Animal animal : animals) {
            animal.update();
        }
        isupdating = false;
        animals.addAll(addinganimals);
        addinganimals.clear();
    }

    @Override
    public void run() {
        while(!isend) {
            Long beforetick = System.currentTimeMillis();
            update();
            Long deltatick = System.currentTimeMillis()-beforetick;
            try {
                sleep(runsec-deltatick);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void end() {
        isend = true;
    }

    public double getDensity() {
        return ((double) maxanimals)/((double) (animals.size()+addinganimals.size()));
    }

}
