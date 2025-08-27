package org.zoo_show.Animals;

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
