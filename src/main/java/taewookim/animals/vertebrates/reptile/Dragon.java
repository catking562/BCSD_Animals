package taewookim.animals.vertebrates.reptile;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animalelement.eattype.Carnivore;
import taewookim.animals.vertebrates.Reptile;
import util.World;

public class Dragon extends Reptile implements Carnivore {
    public Dragon(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        return true;
    }
}
