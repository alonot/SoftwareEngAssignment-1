import org.junit.jupiter.api.Test;
import org.zoo_show.animals.AnimalType;
import org.zoo_show.animals.Cat;
import org.zoo_show.animals.Chimpanzee;
import org.zoo_show.animals.Cow;
import org.zoo_show.animals.Dog;
import org.zoo_show.animals.Lion;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTypeTest {
    @Test
    public void testCowType() {
        Cow cow = new Cow("Zoo");
        assertEquals(AnimalType.COW, cow.getType());
    }
    @Test
    public void testDogType() {
        Dog dog = new Dog("Zoo");
        assertEquals(AnimalType.DOG, dog.getType());
    }
    @Test
    public void testChimpanzeeType() {
        Chimpanzee chimpanzee = new Chimpanzee("Zoo");
        assertEquals(AnimalType.CHIMPANZEE, chimpanzee.getType());
    }
    @Test
    public void testLionType() {
        Lion lion = new Lion("Zoo");
        assertEquals(AnimalType.LION, lion.getType());
    }
    @Test
    public void testCatType() {
        Cat cat = new Cat("Zoo");
        assertEquals(AnimalType.CAT, cat.getType());
    }
}