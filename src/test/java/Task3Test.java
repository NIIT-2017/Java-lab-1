  
import org.junit.Test;

import static org.junit.Assert.*;

class Task3Test {

    @Test
    public void openedRange() {
        assertEquals("1,2,3,4,5,8,10,15,16,17,18,20", Task3.openedRange("1-5,8,10,15-18,20"));
    }
}