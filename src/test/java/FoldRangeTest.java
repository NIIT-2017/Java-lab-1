import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FoldRangeTest
{
    private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outStream));
    }

    @After
    public void clean() {
        System.setOut(null);
    }

    @Test
    public void foldRange_1() {
        FoldRange.foldRange("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24");
        assertEquals("1-24.", outStream.toString());
    }

    @Test
    public void foldRange_2() {
        FoldRange.foldRange("1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23");
        assertEquals("1-2,4-23.", outStream.toString());
    }

    @Test
    public void foldRange_3() {
        FoldRange.foldRange("1,2,3,5,6,7,8,11,12,13,14,15,16,17,18,19,20,21,22");
        assertEquals("1-3,5-8,11-22.", outStream.toString());
    }

    @Test
    public void foldRange_4() {
        FoldRange.foldRange("1,2,3,4,6,7,8,9,10,13,14,15,16,17,18,22,23,24");
        assertEquals("1-4,6-10,13-18,22-24.", outStream.toString());
    }

    @Test
    public void foldRange_5() {
        FoldRange.foldRange("1,2,4,5,7,8,10,11,13,14,15,16,17,18,19,20,21");
        assertEquals("1-2,4-5,7-8,10-11,13-21.", outStream.toString());
    }

    @Test
    public void foldRange_6() {
        FoldRange.foldRange("1,2,4,5,6,9,10,11,12,16,17,18,19,20,25,26,27,28,29,30");
        assertEquals("1-2,4-6,9-12,16-20,25-30.", outStream.toString());
    }

    @Test
    public void foldRange_7() {
        FoldRange.foldRange("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        assertEquals("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34.", outStream.toString());
    }

    @Test
    public void foldRange_8() {
        FoldRange.foldRange("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        assertEquals("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100.", outStream.toString());
    }

    @Test
    public void foldRange_9() {
        FoldRange.foldRange("1,2,4,7,11,12,14,15,16,19,20,21,22");
        assertEquals("1-2,4,7,11-12,14-16,19-22.", outStream.toString());
    }

    @Test
    public void foldRange_10() {
        FoldRange.foldRange("1,3,4,7,9,13,14,15,20,21,22");
        assertEquals("1,3-4,7,9,13-15,20-22.", outStream.toString());
    }
}
