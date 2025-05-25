//------------------------------------------------------
// Assignment 3
// Written by: Kian Kakavandi, 2091078
// For SES350 Section 601 – Spring 2025
//--------------------------------------------------------

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

    @Test
    public void SkyAnimalCreationTest(){
        CenozoicAnimalFactory cenozoicAnimalFactory = new CenozoicAnimalFactory();
        List<SkyAnimal> skyAnimals = cenozoicAnimalFactory.createSkyAnimals();
        assertEquals(1, skyAnimals.size());
        assertEquals("Argentavis", skyAnimals.get(0).getName());
        assertEquals("flapping!", skyAnimals.get(0).getFlying());

    }
}
