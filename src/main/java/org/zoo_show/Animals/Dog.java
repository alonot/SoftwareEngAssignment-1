package org.zoo_show.Animals;

/**
 * Represents a dog.
 */
public class Dog extends Animal {
    /**
     * returns this animal name : "Dog".
     * @return "dog"
     */
    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
