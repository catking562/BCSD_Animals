package taewookim.animals;

import taewookim.Animal;
import taewookim.AnimalTypes;
import util.World;

public abstract class Arthropod extends Animal {
    public Arthropod(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }
}
