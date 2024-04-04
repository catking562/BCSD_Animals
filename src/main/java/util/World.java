package util;

import taewookim.Animal;

import java.util.ArrayList;
import java.util.Iterator;

public class World {

    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Animal> addinganimals = new ArrayList<>();
    boolean isupdating = false;

    public Iterator<Animal> getAnimals() {
        return animals.iterator();
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

}
