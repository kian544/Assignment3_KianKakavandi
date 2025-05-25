import java.util.List;
import java.util.Arrays;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {
    public String getEra(){
        return "We are in the Cenozoic era!";
    }

}

class WollyRhino implements LandAnimal {
    /**
     *
     * @return the name and action the animal is doing
     */
    public String getName(){ return "Wolly Rhino"; }
    public String getWalking(){return "running!";}
}

class Mammoth implements LandAnimal {
    public String getName(){ return "Mammoth"; }
    public String getWalking(){return "stomping!";}
}

class CaveLion implements LandAnimal {
    public String getName(){ return "Cave Lion"; }
    public String getWalking(){return "walking!";}
}

class Otodus implements SeaAnimal {
    public String getName(){ return "Otodus"; }
    public String getSwimming(){return "hunting";}
}