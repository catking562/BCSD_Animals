package taewookim.animals.vertebrates.mammal;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animalelement.eattype.Carnivore;
import taewookim.animals.vertebrates.Mammal;
import util.TRandom;
import util.World;

public class Wolf extends Mammal implements Carnivore {
    public Wolf(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean eatRandom() {
        return TRandom.random.nextInt(600)==0;
    }

    @Override
    public boolean breedingRandom() {
        return TRandom.random.nextInt(400)==0;
    }

    @Override
    protected boolean canEat(Animal animal) {
        AnimalTypes t = animal.getType();
        return t!=AnimalTypes.CROCODILE&&t!=AnimalTypes.DRAGON;
    }
}
