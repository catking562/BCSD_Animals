package taewookim;

import taewookim.animalelement.AnimalState;
import taewookim.animalelement.Gender;
import util.TRandom;
import util.World;

import java.util.Iterator;

public abstract class Animal {

    private final AnimalTypes type;
    private final World w;
    private final int maxAge;
    private int age = 0;
    private AnimalState state = AnimalState.IDK;
    private final Gender gender;
    private int energy = 50;

    public Animal(World w, AnimalTypes type, int maxAge) {
        this.w = w;
        this.type = type;
        this.maxAge = TRandom.random.nextInt(maxAge);
        this.gender = TRandom.random.nextBoolean()?Gender.M:Gender.W;
    }

    public boolean breedingRandom() {
        return TRandom.random.nextInt(600)==0;
    }

    public boolean canBreeding(Animal animal) {
        return animal.type==this.type&&(animal.gender!=this.gender||gender==Gender.All);
    }

    public void breeding() {
        Iterator<Animal> iter = w.getAnimals();
        while(iter.hasNext()) {
            Animal animal = iter.next();
            if(canBreeding(animal)&&breedingRandom()) {
                w.addAnimal(type.createAnimal(w));
            }
        }
    }

    public void dead() {
        state = AnimalState.DEAD;
    }

    public boolean isDead() {
        return state==AnimalState.DEAD;
    }

    protected abstract boolean canEat(Animal animal);

    protected boolean eatRandom() {
        return TRandom.random.nextInt(300)==0;
    }

    protected void eat() {
        Iterator<Animal> iter = w.getAnimals();
        while(iter.hasNext()) {
            Animal animal = iter.next();
            if(canEat(animal)&&eatRandom()) {
                animal.dead();
                energy+=animal.energy;
            }
        }
    }

    public void update() {
        age++;
        if(age>maxAge) {
            dead();
        }
        if(energy<100) {
            eat();
        }
    }

    public final int getAge() {
        return age;
    }

    public final AnimalTypes getType() {
        return type;
    }

}
