public interface AnimalFossilTypes {
    String getName();
}
interface SkyAnimal extends AnimalFossilTypes {
    String getFlying();
}

interface LandAnimal extends AnimalFossilTypes {
    String getWalking();
}

interface SeaAnimal extends AnimalFossilTypes {
    String getSwimming();
}