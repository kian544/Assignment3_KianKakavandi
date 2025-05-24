import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LazySingletonTest {

    @Test
    public void testAsRequired(){ //checking to see if it works and creates
                                  // the exact instance ive asked it to
        LazySingleton l1=LazySingleton.getInstance(0);
        assertEquals(0,l1.getId());

        LazySingleton l2=LazySingleton.getInstance(1);
        assertEquals(1,l2.getId());
    }

    @Test
    public void TestInstanceReturn(){
        LazySingleton l1=LazySingleton.getInstance(1);
        LazySingleton l2=LazySingleton.getInstance(1);
        assertSame(l1,l2); //ensuring the same instantiation is returned, same as Eager
    }
}
