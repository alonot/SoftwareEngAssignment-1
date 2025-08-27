package org.zoo_show;

import org.zoo_show.animals.Animal;
import org.zoo_show.animals.AnimalType;
import org.zoo_show.animals.Cat;
import org.zoo_show.animals.Chimpanzee;
import org.zoo_show.animals.Cow;
import org.zoo_show.animals.Dog;
import org.zoo_show.animals.Lion;

import java.util.Arrays;

/**
 * Main class that demonstrates a Zoo where different animals make their unique sound.
 */
public class Main {
    /**
     * The main function which handles the Zoo show.
     * @param args Input arguments to the program.
     */
    public static void main(final String[] args) {

        final Animal[] animals = new Animal[]{
            new Cow("Coww"),
            new Dog("Dogg"),
            new Lion("Lionn"),
            new Cat("Catt"),
            new Chimpanzee("Chimp"),
        };

        System.out.println("Welcome to the Zoo!!");
        System.out.println("We have " + animals.length + " animals");
        Arrays.stream(animals).forEach(animal -> {
            final String name =  animal.getName();
            final AnimalType type = animal.getType();
            System.out.println(name + ",a " + type + ", comes to the Stage...");
            System.out.println("It says: ");
            animal.makeSound();
            System.out.println(name + " leaves...");
        });
    }
}