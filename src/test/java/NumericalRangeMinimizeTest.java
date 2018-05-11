import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class NumericalRangeMinimizeTest {

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
    public void minimize1() {
        NumericalRangeMinimize myStr1=new NumericalRangeMinimize("1,2,3,4,7,9,12,13,14,15,16,21,25,27,28,29,30,31,33,37");
        myStr1.minimize();
        assertEquals("1-4, 7, 9, 12-16, 21, 25, 27-31, 33, 37", output.toString());
    }
    @Test
    public void minimize2() {
        NumericalRangeMinimize myStr2=new NumericalRangeMinimize("1,4,7,9,12,13,14,15,16,21,25,27,28,29,30,31");
        myStr2.minimize();
        assertEquals("1, 4, 7, 9, 12-16, 21, 25, 27-31", output.toString());
    }
    @Test
    public void minimize3() {
        NumericalRangeMinimize myStr3=new NumericalRangeMinimize("1,2,3,4,7,8,9,12,13,14,15,16,21,22,23,24,25,27,28,29,30,31");
        myStr3.minimize();
        assertEquals("1-4, 7-9, 12-16, 21-25, 27-31", output.toString());
    }

}



