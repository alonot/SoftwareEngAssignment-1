package org.example;

import org.example.Animals.Animal;
import org.example.Animals.Cat;
import org.example.Animals.Chimpanzee;
import org.example.Animals.Cow;
import org.example.Animals.Dog;
import org.example.Animals.Lion;

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
            new Cow(),
            new Dog(),
            new Lion(),
            new Cat(),
            new Chimpanzee(),
        };

        System.out.println("Welcome to the Zoo!!");
        System.out.println("We have " + animals.length + " animals");
        Arrays.stream(animals).forEach(animal -> {
            final String name =  animal.getName();
            System.out.println(name + " comes to the Stage...");
            System.out.println("It says: ");
            animal.makeSound();
            System.out.println(name + " leaves...");
        });
    }
}