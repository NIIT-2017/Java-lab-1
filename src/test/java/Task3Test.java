import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task3Test {
    @Test
    public void expandTest() {
        assertEquals("1,2,3,4,5,7,8,9,10,11,12,18,19,20,21", Task3.expand("1-5,7-12,18-21"));
        assertEquals("1,2,3,5,8,10,11,15,21,22,23", Task3.expand("1,2,3,5,8,10-11,15,21-23"));
    }
}