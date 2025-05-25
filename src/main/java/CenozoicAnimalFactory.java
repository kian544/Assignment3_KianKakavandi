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
    public String getWalking(){return "stomping!";}
}


