
public class EagerSingleton {
    private static EagerSingleton[] instances; new EagerSingleton[3];
    static {
        for (int i = 0; i < 3; i++) {
            instances[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + "instantiated");
        }
    }
}
