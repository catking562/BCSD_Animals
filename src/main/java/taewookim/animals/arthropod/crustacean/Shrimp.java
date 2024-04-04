package taewookim.animals.arthropod.crustacean;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animals.arthropod.Crustacean;
import util.TRandom;
import util.World;

public class Shrimp extends Crustacean {
    public Shrimp(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean eatRandom() {
        return TRandom.random.nextInt(10)==0;
    }

    @Override
    public boolean breedingRandom() {
        return TRandom.random.nextInt(10)==0;
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }
}
