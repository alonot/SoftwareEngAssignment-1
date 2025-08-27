package org.zoo_show.animals;

/**
 * Represents a lion.
 */
public class Lion extends Animal {

    /**
     * name of the lion.
     */
    private final String name;

    /**
     * Constructs a lion with a name.
     * @param lionName The name of the lion.
     */
    public Lion(final String lionName) {
        this.name = lionName;
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
     * returns this animal type : "Lion".
     * @return Lion
     */
    @Override
    public AnimalType getType() {
        return AnimalType.LION;
    }

    @Override
    public String makeSound() {
        return  "Roar!";
    }
}
