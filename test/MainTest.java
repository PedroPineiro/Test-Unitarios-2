import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    @DisplayName("Test 1")
    public void testSingleton(){
        Singleton dato1=Singleton.getInstance();
        Singleton dato2=Singleton.getInstance();
        assertEquals(dato1,dato2);
    }
}
