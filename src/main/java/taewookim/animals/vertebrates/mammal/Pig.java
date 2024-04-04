package taewookim.animals.vertebrates.mammal;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animals.vertebrates.Mammal;
import util.World;

public class Pig extends Mammal {
    public Pig(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }
}
