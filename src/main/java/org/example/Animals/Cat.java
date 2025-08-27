package org.example.Animals;

/**
 * Represents Cat.
 */
public class Cat extends Animal {

    /**
     * returns this animal name : "Cat".
     * @return Cat
     */
    @Override
    public String getName() {
        return "Cat";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
