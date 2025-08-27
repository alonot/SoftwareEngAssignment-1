package org.example.Animals;

/**
 * The base class for all the animals.
 */
public abstract class Animal {
    /**
     * Returns name of the animal.
     * Each animal will override this to return their own name.
     * @return String
     */
    public abstract String getName();

    /**
     * By default, each animals make random sounds.
     * Animals with their own characteristic sounds override this method.
     */
    public void makeSound() {
        System.out.println("!!Random sounds!!");
    }
}
