package taewookim.animals.arthropod.crustacean;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animals.arthropod.Crustacean;
import util.World;

public class Shrimp extends Crustacean {
    public Shrimp(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        return false;
    }
}
