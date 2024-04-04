package taewookim.animals.vertebrates.reptile;

import taewookim.Animal;
import taewookim.AnimalTypes;
import taewookim.animalelement.eattype.Carnivore;
import taewookim.animals.vertebrates.Reptile;
import taewookim.animals.vertebrates.mammal.Cat;
import util.World;

public class Snake extends Reptile implements Carnivore {
    public Snake(World w, AnimalTypes type, int maxAge) {
        super(w, type, maxAge);
    }

    @Override
    protected boolean canEat(Animal animal) {
        AnimalTypes t = animal.getType();
        return t==AnimalTypes.CHICKEN||t==AnimalTypes.MOUSE||t==AnimalTypes.CAT||t==AnimalTypes.DOG||t==AnimalTypes.PIG||t==AnimalTypes.RABBIT;
    }
}
