import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class NumericalRangeSweepTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(output));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }

    @Test
    public void sweep1() {
        NumericalRangeSweep myStr1 = new NumericalRangeSweep("1-4,7,9,12-16,21,25,27-31,33,37");
        myStr1.sweep();
        assertEquals("1, 2, 3, 4, 7, 9, 12, 13, 14, 15, 16, 21, 25, 27, 28, 29, 30, 31, 33, 37", output.toString());
    }
    @Test
    public void sweep2() {
        NumericalRangeSweep myStr2 = new NumericalRangeSweep("1,4,7,9,12-16,21,25,27-31");
        myStr2.sweep();
        assertEquals("1, 4, 7, 9, 12, 13, 14, 15, 16, 21, 25, 27, 28, 29, 30, 31", output.toString());
    }
    @Test
    public void sweep3() {
        NumericalRangeSweep myStr3 = new NumericalRangeSweep("1-4,7-9,12-16,21-25,27-31");
        myStr3.sweep();
        assertEquals("1, 2, 3, 4, 7, 8, 9, 12, 13, 14, 15, 16, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31", output.toString());
    }
}