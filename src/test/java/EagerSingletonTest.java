import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EagerSingletonTest {
    @Test
    public void TestPreCreation(){
        for(int i=0;i<3;i++){
            EagerSingleton e=EagerSingleton.getInstance(i);
            assertEquals(i, e.getId());//ensuring the singletons are precreated
        }
    }

    @Test
    public void TestInstanceReturn(){
        EagerSingleton e1=EagerSingleton.getInstance(1);
        EagerSingleton e2=EagerSingleton.getInstance(1);
        assertSame(e1,e2); //ensuring the same instantiation is returned
    }

}