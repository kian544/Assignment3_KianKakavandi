import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTests {

    @Test
    public void LandAnimalCreationTest(){
        CenozoicAnimalFactory cenozoicAnimalFactory = new CenozoicAnimalFactory();
        List<LandAnimal> landAnimals = cenozoicAnimalFactory.createLandAnimals();
        assertEquals(3, landAnimals.size());
        assertEquals("Cave Lion", landAnimals.get(0).getName());
        assertEquals("walking!", landAnimals.get(0).getWalking());
    }
}
