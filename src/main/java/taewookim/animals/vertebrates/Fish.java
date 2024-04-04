package taewookim.animals.vertebrates;

import taewookim.AnimalTypes;
import taewookim.animals.Vertebrate;
import util.World;

public abstract class Fish extends Vertebrate {
    public Fish(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }
}
