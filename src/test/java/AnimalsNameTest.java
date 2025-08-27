import org.junit.jupiter.api.Test;
import org.zoo_show.animals.Cat;
import org.zoo_show.animals.Chimpanzee;
import org.zoo_show.animals.Cow;
import org.zoo_show.animals.Dog;
import org.zoo_show.animals.Lion;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for Animal Names
 */
public class AnimalsNameTest {
    /**
     * Test Cow Name
     */
    @Test
    public void testCowName() {
        Cow cow = new Cow("Zoo");
        assertEquals("Zoo", cow.getName());
    }
    /**
     * Test Dog Name
     */
    @Test
    public void testDogName() {
        Dog dog = new Dog("Zoo");
        assertEquals("Zoo", dog.getName());
    }
    /**
     * Test Chimpanzee Name
     */
    @Test
    public void testChimpanzeeName() {
        Chimpanzee chimpanzee = new Chimpanzee("Zoo");
        assertEquals("Zoo", chimpanzee.getName());
    }
    /**
     * Test Lion Name
     */
    @Test
    public void testLionName() {
        Lion lion = new Lion("Zoo");
        assertEquals("Zoo", lion.getName());
    }
    /**
     * Test Cat Name
     */
    @Test
    public void testCatName() {
        Cat cat = new Cat("Zoo");
        assertEquals("Zoo", cat.getName());
    }
}