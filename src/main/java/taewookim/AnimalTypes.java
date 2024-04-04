package taewookim;

import util.World;

public enum AnimalTypes {

    ANIMAL(Animal.class, 0);

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
