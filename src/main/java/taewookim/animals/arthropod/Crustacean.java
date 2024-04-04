package taewookim.animals.arthropod;

import taewookim.AnimalTypes;
import taewookim.animals.Arthropod;
import util.World;

public abstract class Crustacean extends Arthropod {
    public Crustacean(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }
}
