import java.util.List;

public interface AnimalAbstractFactory {
    String getEra();
    List<SkyAnimal> skyAnimals;
    List<LandAnimal> landAnimals;
    List<SeaAnimal> seaAnimals;
}
