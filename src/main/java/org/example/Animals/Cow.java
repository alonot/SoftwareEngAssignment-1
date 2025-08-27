package org.example.Animals;

/**
 * Represents a cow.
 */
public class Cow extends Animal {
    /**
     * returns this animal name : "Cow".
     * @return Cow
     */
    @Override
    public String getName() {
        return "Cow";
    }

    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}
