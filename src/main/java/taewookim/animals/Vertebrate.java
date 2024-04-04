package taewookim.animals;

import taewookim.Animal;
import taewookim.AnimalTypes;
import util.World;

public abstract class Vertebrate extends Animal {
    public Vertebrate(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }
}
