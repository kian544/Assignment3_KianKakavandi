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
