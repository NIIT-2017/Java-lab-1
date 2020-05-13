import org.junit.Test;
import static org.junit.Assert.*;

public class task3Test {
    @Test
    public void unfoldRange() {
        assertEquals("1,4,5,6,7,9,-15,-14,-13,-12,-11,-10,7", task3.unfoldRange("1,4-7,9,-15--10,7"));
        assertEquals("-3,-2,-1,0,1,2,89,115,116,117,118", task3.unfoldRange("-3-2,89,115-118"));
        assertEquals("-4,-3,-2,-1,0,1,2,3,4,5", task3.unfoldRange("-4,-3,-2,-1,0,1,2,3,4,5"));
        assertEquals("5,6,0,1,2,3,4,7,8", task3.unfoldRange("5,6,0-4,7,8"));
        assertEquals("12345", task3.unfoldRange("12345"));
    }
}