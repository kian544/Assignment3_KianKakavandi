import java.util.List;
import java.util.Arrays;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {
    public String getEra(){
        return "The Cenozoic era";
    }
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new CaveLion(), new WollyRhino(), new Mammoth());
    }
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Whale(), new Otodus());
    }
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Argentavis());
    }



}

//Land Animals
class WollyRhino implements LandAnimal {
    /**
     *
     * @return the name and action the landAnimal is doing
     */
    public String getName(){ return "Wolly Rhino";}
    public String getWalking(){return "running!";}
}

class Mammoth implements LandAnimal {
    public String getName(){ return "Mammoth";}
    public String getWalking(){return "stomping!";}
}

class CaveLion implements LandAnimal {
    public String getName(){ return "Cave Lion";}
    public String getWalking(){return "walking!";}
}

//sea animals
class Otodus implements SeaAnimal {
    /**
     *
     * @return the name and the actions of the SeaAnimals
     */
    public String getName(){ return "Otodus";}
    public String getSwimming(){return "hunting";}
}

class Whale implements SeaAnimal {
    public String getName(){ return "Whale";}
    public String getSwimming(){return "swimming!";}
}

class Argentavis implements SkyAnimal {
    public String getName(){ return "Argentavis";}
    public String getFlying(){return "flapping!";}
}