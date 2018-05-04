import org.junit.Test;

import static org.junit.Assert.*;

public class ClottingTest {

    @Test
    public void printLine() {
        String line = "1,3,4,5,6,8,9";
        Clotting range = new Clotting(line);
        assertEquals("1,3-6,8,9", range.PrintLine());
    }
}