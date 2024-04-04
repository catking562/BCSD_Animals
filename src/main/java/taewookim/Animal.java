package taewookim;

import taewookim.animalelement.AnimalState;
import util.TRandom;

public abstract class Animal {

    private final int maxAge;
    private int age = 0;
    private AnimalState state = AnimalState.IDK;

    public Animal(int maxAge) {
        this.maxAge = TRandom.random.nextInt(maxAge);
    }

    public void update() {
        age++;
        if(age==maxAge) {
            state = AnimalState.DEAD;
        }
    }

    public int getAge() {
        return age;
    }

}
