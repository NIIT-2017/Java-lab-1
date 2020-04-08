  
import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void cutNumber() {
        assertEquals(15.937, Task2.cutNumber(254,3), 0.001);
        assertEquals(15.94, Task2.cutNumber(254,2), 0.01);
        assertEquals(2.00, Task2.cutNumber(4,2), 0.01);
    }
}