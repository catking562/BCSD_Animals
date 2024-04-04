package taewookim.animals.vertebrates;

import taewookim.AnimalTypes;
import taewookim.animals.Vertebrate;
import util.World;

public abstract class Mammal extends Vertebrate {
    public Mammal(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }
}
