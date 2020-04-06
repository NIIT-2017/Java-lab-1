import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task3Test {

    @Test
    void openedRange() {
        assertEquals("1,2,3,4,5,8,10,15,16,17,18,20",task3.openedRange("1-5,8,10,15-18,20"));
    }
}