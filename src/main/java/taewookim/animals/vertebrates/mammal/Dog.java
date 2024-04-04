package taewookim.animals.vertebrates.mammal;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animalelement.eattype.Carnivore;
import taewookim.animals.vertebrates.Mammal;
import util.World;

public class Dog extends Mammal implements Carnivore {
    public Dog(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        AnimalTypes t = animal.getType();
        return t==AnimalTypes.CHICKEN||t==AnimalTypes.PIG||t==AnimalTypes.RABBIT||t==AnimalTypes.MOUSE||t==AnimalTypes.TURTLE;
    }
}
