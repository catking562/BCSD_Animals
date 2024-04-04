package taewookim.animals.vertebrates;

import taewookim.AnimalTypes;
import taewookim.animals.Vertebrate;
import util.World;

public abstract class Reptile extends Vertebrate {
    public Reptile(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }
}
