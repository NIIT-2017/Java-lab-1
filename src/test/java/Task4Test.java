import org.junit.Test;

import static org.junit.Assert.*;

class Task4Test {

    @Test
    public void closedRange() {
        assertEquals("1-5,18,21,23-25,28-30", Task4.closedRange("1,2,3,4,5,18,21,23,24,25,28,29,30"));
        assertEquals("1", Task4.closedRange("1"));
        assertEquals("1,2,4-7,18-21", Task4.closedRange("1,2,4,5,6,7,18,19,20,21"));
    }
}