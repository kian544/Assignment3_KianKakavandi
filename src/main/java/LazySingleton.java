/**
 * Creating instances when needed, non-instant
 */
public class LazySingleton {

    private static LazySingleton[]  instances = new LazySingleton[3];
    static{
        for(int i = 0; i < 3; i++){
            instances[i] = new LazySingleton(i);
            System.out.println("LazySingleton " + i + " instantiated");
        }
    }

    private int id;

    /**
     *
     * @param id 0,1,2
     */
    private LazySingleton(int id) {
        this.id = id;
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
