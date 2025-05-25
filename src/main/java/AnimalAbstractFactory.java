//------------------------------------------------------
// Assignment 3
// Written by: Kian Kakavandi, 2091078
// For SES350 Section 601 – Spring 2025
//--------------------------------------------------------

import java.util.List;

public interface AnimalAbstractFactory {
    /**
     *
     * @return the animals set to the creation type
     */
    String getEra();
    List<SkyAnimal> createSkyAnimals();
    List<LandAnimal> createLandAnimals();
    List<SeaAnimal> createSeaAnimals();
}
