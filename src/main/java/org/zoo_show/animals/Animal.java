package org.zoo_show.animals;

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
     * Returns type of the animal.
     * Each animal will override this to return their own type.
     * @return String
     */
    public abstract AnimalType getType();

    /**
     * By default, each animals make random sounds.
     * Animals with their own characteristic sounds override this method.
     * @return sound
     */
    public String makeSound() {
        return "Random sounds!!";
    }
}
