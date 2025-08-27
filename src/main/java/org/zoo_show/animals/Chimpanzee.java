package org.zoo_show.animals;

/**
 * Represents a Chimpanzee.
 */
public class Chimpanzee extends Animal {

    /**
     * name of the chimpanzee.
     */
    private final String name;

    /**
     * Constructs a Chimpanzee with a name.
     * @param chimpName The name of the chimpanzee.
     */
    public Chimpanzee(final String chimpName) {
        this.name = chimpName;
    }

    /**
     * returns this animal type : "Chimpanzee".
     * @return Chimpanzee
     */
    @Override
    public AnimalType getType() {
        return AnimalType.CHIMPANZEE;
    }

    /**
     * returns this animal name.
     * @return Chimpanzee
     */
    @Override
    public String getName() {
        return name;
    }
}
