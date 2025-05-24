import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EagerSingletonTest {
    @Test
    public void TestPreCreation(){
        for(int i=0;i<3;i++){
            EagerSingleton e=EagerSingleton.getInstance(i);
            assertEquals(i, e.getId());
        }
    }
}