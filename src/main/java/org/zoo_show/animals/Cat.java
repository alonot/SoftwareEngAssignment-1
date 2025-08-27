package org.zoo_show.animals;

/**
 * Represents Cat.
 */
public class Cat extends Animal {

    /**
     * name of the cat.
     */
    private final String name;

    /**
     * Constructs a Cat with a name.
     * @param catName The name of the cat.
     */
    public Cat(final String catName) {
        this.name = catName;
    }

    /**
     * returns this animal name.
     * @return this.name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * returns this animal type : "Cat".
     * @return Cat
     */
    @Override
    public AnimalType getType() {
        return AnimalType.CAT;
    }

    @Override
    public String makeSound() {
        return "Meow! Meow!";
    }
}
