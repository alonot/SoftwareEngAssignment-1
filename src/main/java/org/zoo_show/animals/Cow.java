package org.zoo_show.animals;

/**
 * Represents a cow.
 */
public class Cow extends Animal {

    /**
     * name of the cow.
     */
    private final String name;

    /**
     * Constructs a cow with a name.
     * @param cowName The name of the cow.
     */
    public Cow(final String cowName) {
        this.name = cowName;
    }

    /**
     * returns this animal type : "Cow".
     * @return Cow
     */
    @Override
    public AnimalType getType() {
        return AnimalType.COW;
    }

    /**
     * returns this animal name.
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String makeSound() {
        return "Moo!";
    }
}
