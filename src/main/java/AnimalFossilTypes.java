//------------------------------------------------------
// Assignment 3
// Written by: Kian Kakavandi, 2091078
// For SES350 Section 601 – Spring 2025
//--------------------------------------------------------

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