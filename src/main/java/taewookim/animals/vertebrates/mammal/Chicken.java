package taewookim.animals.vertebrates.mammal;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animals.vertebrates.Mammal;
import util.World;

public class Chicken extends Mammal {
    public Chicken(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }
}
