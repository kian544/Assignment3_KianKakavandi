import java.util.List;
import java.util.Arrays;

public class CenozoicAnimalFactory implements AnimalAbstractFactory {
    public String getEra(){
        return "We are in the Cenozoic era!";
    }

}

class WollyRhino implements LandAnimal {
    public String getName(){ return "Wolly Rhino"; }
    public String getWalking(){return "stomping!";}
}

