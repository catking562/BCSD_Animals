package taewookim.animals.vertebrates.reptile;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animals.vertebrates.Reptile;
import util.World;

public class Snake extends Reptile {
    public Snake(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }
}
