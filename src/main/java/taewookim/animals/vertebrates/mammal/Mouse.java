package taewookim.animals.vertebrates.mammal;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animals.vertebrates.Mammal;
import util.TRandom;
import util.World;

public class Mouse extends Mammal {
    public Mouse(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean eatRandom() {
        return TRandom.random.nextInt(10)==0;
    }

    @Override
    public boolean breedingRandom() {
        return TRandom.random.nextInt(50)==0;
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }
}
