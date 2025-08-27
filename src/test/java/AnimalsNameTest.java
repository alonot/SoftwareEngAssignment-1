import org.junit.jupiter.api.Test;
import org.zoo_show.animals.Cat;
import org.zoo_show.animals.Chimpanzee;
import org.zoo_show.animals.Cow;
import org.zoo_show.animals.Dog;
import org.zoo_show.animals.Lion;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsNameTest {
    @Test
    public void testCowName() {
        Cow cow = new Cow("Zoo");
        assertEquals("Zoo", cow.getName());
    }
    @Test
    public void testDogName() {
        Dog dog = new Dog("Zoo");
        assertEquals("Zoo", dog.getName());
    }
    @Test
    public void testChimpanzeeName() {
        Chimpanzee chimpanzee = new Chimpanzee("Zoo");
        assertEquals("Zoo", chimpanzee.getName());
    }
    @Test
    public void testLionName() {
        Lion lion = new Lion("Zoo");
        assertEquals("Zoo", lion.getName());
    }
    @Test
    public void testCatName() {
        Cat cat = new Cat("Zoo");
        assertEquals("Zoo", cat.getName());
    }
}