  
import org.junit.Test;

import static org.junit.Assert.*;

class Task2Test {

    @Test
    public void cutNumber() {
        assertEquals(15.937, Task2.cutNumber(254,3));
        assertEquals(15.94, Task2.cutNumber(254,2));
        assertEquals(2.00, Task2.cutNumber(4,2));
    }
}