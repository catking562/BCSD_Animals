package taewookim.animals.vertebrates.mammal;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animals.vertebrates.Fish;
import taewookim.animals.vertebrates.Mammal;
import util.World;

public class Cat extends Mammal {

    public Cat(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }
}
