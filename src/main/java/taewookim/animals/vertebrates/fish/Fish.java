package taewookim.animals.vertebrates.fish;

import taewookim.Animal;
import taewookim.AnimalTypes;
import util.World;

public class Fish extends taewookim.animals.vertebrates.Fish {
    public Fish(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }
}
