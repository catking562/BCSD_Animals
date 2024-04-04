package taewookim.animals.vertebrates.mammal;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animalelement.eattype.Carnivore;
import taewookim.animals.arthropod.crustacean.Shrimp;
import taewookim.animals.vertebrates.Fish;
import taewookim.animals.vertebrates.Mammal;
import util.World;

public class Cat extends Mammal implements Carnivore {

    public Cat(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        AnimalTypes t = animal.getType();
        return t==AnimalTypes.FISH||t==AnimalTypes.CHICKEN||t==AnimalTypes.MOUSE||t==AnimalTypes.RABBIT||t==AnimalTypes.SHRIMP||t==AnimalTypes.TURTLE;
    }
}
