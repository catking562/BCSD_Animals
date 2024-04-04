package taewookim;

import taewookim.animals.arthropod.crustacean.Crab;
import taewookim.animals.arthropod.crustacean.Shrimp;
import taewookim.animals.vertebrates.fish.Fish;
import taewookim.animals.vertebrates.mammal.*;
import taewookim.animals.vertebrates.reptile.Crocodile;
import taewookim.animals.vertebrates.reptile.Dragon;
import taewookim.animals.vertebrates.reptile.Snake;
import taewookim.animals.vertebrates.reptile.Turtle;
import util.World;

public enum AnimalTypes {

    ANIMAL(Animal.class, 0),
    CAT(Cat.class, 7300),
    CHICKEN(Chicken.class, 3750),
    DOG(Dog.class, 7300),
    MOUSE(Mouse.class, 730),
    PIG(Pig.class, 7300),
    RABBIT(Rabbit.class, 1865),
    WOLF(Wolf.class, 5840),
    FISH(Fish.class, 7300),
    CROCODILE(Crocodile.class, 18250),
    DRAGON(Dragon.class, 365000),
    SNAKE(Snake.class, 3650),
    TURTLE(Turtle.class, 10950),
    CRAB(Crab.class, 1095),
    SHRIMP(Shrimp.class, 2190)
    ;

    private final Class<? extends Animal> clz;
    private final int age;

    AnimalTypes(Class<? extends Animal> clz, int age) {
        this.clz = clz;
        this.age = age;
    }

    public Animal createAnimal(World w) {
        try{
            return clz.getConstructor(World.class, AnimalTypes.class, int.class).newInstance(w, this, age);
        }catch(Exception e) {
            return null;
        }
    }

}
