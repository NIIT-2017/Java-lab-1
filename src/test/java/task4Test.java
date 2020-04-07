import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class task4Test {

    @Test
    void fillResult() {
        assertEquals("1,4-7,18-21,10,11,32-35,17,475-478,15", task4.fillResult("1,4,5,6,7,18,19,20,21,10,11,32,33,34,35,17,475,476,477,478,15"));
    }
}

