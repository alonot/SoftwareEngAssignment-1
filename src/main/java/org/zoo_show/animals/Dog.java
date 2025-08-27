package org.zoo_show.animals;

/**
 * Represents a dog.
 */
public class Dog extends Animal {

    /**
     * name of the dog.
     */
    private final String name;

    /**
     * Constructs a dog with a name.
     * @param dogName The name of the dog.
     */
    public Dog(final String dogName) {
        this.name = dogName;
    }

    /**
     * returns this animal name.
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * returns this animal type : "Dog".
     * @return Dog
     */
    @Override
    public AnimalType getType() {
        return AnimalType.DOG;
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }
}
