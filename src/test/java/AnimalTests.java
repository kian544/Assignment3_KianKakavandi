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

    @Test
    public void SeaAnimalCreationTest(){
        CenozoicAnimalFactory cenozoicAnimalFactory = new CenozoicAnimalFactory();
        List<SeaAnimal> seaAnimals = cenozoicAnimalFactory.createSeaAnimals();
        assertEquals(2, seaAnimals.size());
        assertEquals("Otodus", seaAnimals.get(1).getName());
        assertEquals("hunting!", seaAnimals.get(1).getSwimming());
    }
}
