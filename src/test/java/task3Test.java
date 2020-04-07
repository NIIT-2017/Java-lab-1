import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class task3Test {

    @Test
    void unfoldRange() {
        assertEquals("1,2,4,5,6,7,18,19,20,21,32,33,34,35,475,476,477,478,15", task3.unfoldRange("1,2,4-7,18-21,32-35,475-478,15"));
    }
}