import org.junit.Test;

import static org.junit.Assert.*;

public class ExpandTest extends Expand{
    @Test
    public void expandTest() {
        assertEquals(expand("1-4,8,10-14,20,22,25,28"), "1,2,3,4,8,10,11,12,13,14,20,22,25,28");
    }
}