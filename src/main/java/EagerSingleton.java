/**
 * Creating 3 instances for EagerSingleton, at once
 */
public class EagerSingleton {
    private static EagerSingleton[] instances = new EagerSingleton[3];
    static {
        for (int i = 0; i < 3; i++) {
            instances[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + "instantiated");
        }
    }

    private int id;

    /**
     *
     * @param id = 0,1,2
     */
    private EagerSingleton(int id) {
        this.id = id;
    }

    /**
     *
     * @return id of EagerSingleton instance
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param index = index of instance#(0,1,2)
     * @return the EagerSingleton
     * @throw exception if OOB
     */
    public static EagerSingleton getInstance(int index){
        if(index<0||index>2){
            throw new IllegalArgumentException("index out of bounds, must be between 0 and 2");
        }
        if(instances[index]==null){
            instances[index]=new EagerSingleton(index);
        }
        return instances[index];
    }
}
