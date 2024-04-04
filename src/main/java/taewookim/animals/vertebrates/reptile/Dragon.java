package taewookim.animals.vertebrates.reptile;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animalelement.eattype.Carnivore;
import taewookim.animals.vertebrates.Reptile;
import util.TRandom;
import util.World;

public class Dragon extends Reptile implements Carnivore {
    public Dragon(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    public boolean breedingRandom() {
        return TRandom.random.nextInt(36000)==0;
    }

    @Override
    public void energyUpdate() {
        if(TRandom.random.nextInt(10)==0) {
            super.energyUpdate();
        }
    }

    @Override
    protected boolean canEat(Animal animal) {
        return true;
    }
}
