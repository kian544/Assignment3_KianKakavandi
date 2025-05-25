//------------------------------------------------------
// Assignment 3
// Written by: Kian Kakavandi, 2091078
// For SES350 Section 601 – Spring 2025
//--------------------------------------------------------

/**
 * Creating instances when needed, non-instant
 */
public class LazySingleton {

    private static LazySingleton[]  instances = new LazySingleton[3];

    private int id;

    /**
     *
     * @param id 0,1,2
     */
    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    /**
     *
     * @return id of LazySingleton
     */
    public int getId() {
        return id;
    }


    /**
     *
     * @param index of instance 0,1,2
     * @return the LazySingleton
     * @throw OOB exception
     */
    public static LazySingleton getInstance(int index){
        if(index<0 || index>2){
            throw new IllegalArgumentException("index out of bounds, must be between 0 and 2");
        }
        if(instances[index]==null){
            instances[index] = new LazySingleton(index);
        }
        return instances[index];
    }
}
