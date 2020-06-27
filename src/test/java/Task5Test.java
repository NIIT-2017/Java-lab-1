import static org.junit.Assert.*;
import org.junit.Test;

public class Task5Test
{
    @Test
    public  void TestTask5() throws Exception
    {
        assertEquals("  ***    ", Task5.makeString("0",0));
        assertEquals("    *     ***     ", Task5.makeString("12",0));
        assertEquals("   **    *    *   ", Task5.makeString("12",1));

    }
}