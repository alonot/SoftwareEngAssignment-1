package org.zoo_show.Animals;

/**
 * Represents a lion.
 */
public class Lion extends Animal {

    /**
     * returns this animal name : "Lion".
     * @return "Lion"
     */
    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public void makeSound() {
        System.out.println("Roar! ");
    }
}
