package taewookim.animals.vertebrates.reptile;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animals.vertebrates.Reptile;
import util.TRandom;
import util.World;

public class Turtle extends Reptile {
    public Turtle(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean eatRandom() {
        return TRandom.random.nextInt(10)==0;
    }

    @Override
    public boolean breedingRandom() {
        return TRandom.random.nextInt(150)==0;
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }
}
