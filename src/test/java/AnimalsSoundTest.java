import org.junit.jupiter.api.Test;
import org.zoo_show.animals.Cat;
import org.zoo_show.animals.Chimpanzee;
import org.zoo_show.animals.Cow;
import org.zoo_show.animals.Dog;
import org.zoo_show.animals.Lion;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Animal Sounds
 */
public class AnimalsSoundTest {
    /**
     * Test Cow Sound
     */
    @Test
    public void testCowSpeak() {
        Cow cow = new Cow("Zoo");
        assertEquals("Moo!", cow.makeSound());
    }
    /**
     * Test Dog Sound
     */
    @Test
    public void testDogSpeak() {
        Dog dog = new Dog("Zoo");
        assertEquals("Woof! Woof!", dog.makeSound());
    }
    /**
     * Test Chimpanzee Sound
     */
    @Test
    public void testChimpanzeeSpeak() {
        Chimpanzee chimpanzee = new Chimpanzee("Zoo");
        assertEquals("Random sounds!!", chimpanzee.makeSound());
    }
    /**
     * Test Lion Sound
     */
    @Test
    public void testLionSpeak() {
        Lion lion = new Lion("Zoo");
        assertEquals("Roar!", lion.makeSound());
    }
    /**
     * Test Cat Sound
     */
    @Test
    public void testCatSpeak() {
        Cat cat = new Cat("Zoo");
        assertEquals("Meow! Meow!", cat.makeSound());
    }
}