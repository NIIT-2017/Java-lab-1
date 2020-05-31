import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void roll() {
        Task4 testRoll = new Task4();
        assertEquals("1,2,4-7,18-21.", testRoll.roll ("1,2,4,5,6,7,18,19,20,21") );
    }
}