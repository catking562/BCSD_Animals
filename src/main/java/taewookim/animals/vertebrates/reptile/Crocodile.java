package taewookim.animals.vertebrates.reptile;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animalelement.eattype.Carnivore;
import taewookim.animals.vertebrates.Mammal;
import taewookim.animals.vertebrates.Reptile;
import util.TRandom;
import util.World;

public class Crocodile extends Reptile implements Carnivore {
    public Crocodile(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean eatRandom() {
        return TRandom.random.nextInt(600)==0;
    }

    @Override
    public boolean breedingRandom() {
        return TRandom.random.nextInt(800)==0;
    }

    @Override
    protected boolean canEat(Animal animal) {
        AnimalTypes t = animal.getType();
        return t==AnimalTypes.FISH||t==AnimalTypes.SHRIMP||t==AnimalTypes.CRAB;
    }
}
