import org.junit.Test;
import static org.junit.Assert.*;

public class task4Test {

    @Test
    public void fillResult() {
        assertEquals("-5--2,0,2,718-720",task4.fillResult("-5,-4,-3,-2,0,2,718,719,720"));
        assertEquals("1,4-7,-15--12,7", task4.fillResult("1,4,5,6,7,-15,-14,-13,-12,7"));
        assertEquals("-3,2,-1-1,-2,3", task4.fillResult("-3,2,-1,0,1,-2,3"));
        assertEquals("-3-3", task4.fillResult("-3,-2,-1,0,1,2,3"));
        assertEquals("12345", task4.fillResult("012345"));
    }
}