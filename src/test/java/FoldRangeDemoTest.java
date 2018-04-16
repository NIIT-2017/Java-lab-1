import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FoldRangeDemoTest
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
    public void printFoldRange_1() {
        FoldRangeDemo.printFoldRange("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24");
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24\r\n1-24\r\n", outStream.toString());
    }

    @Test
    public void printFoldRange_2() {
        FoldRangeDemo.printFoldRange("1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23");
        assertEquals("1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23\r\n1-2,4-23\r\n", outStream.toString());
    }

    @Test
    public void printFoldRange_3() {
        FoldRangeDemo.printFoldRange("1,2,3,5,6,7,8,11,12,13,14,15,16,17,18,19,20,21,22");
        assertEquals("1,2,3,5,6,7,8,11,12,13,14,15,16,17,18,19,20,21,22\r\n1-3,5-8,11-22\r\n", outStream.toString());
    }

    @Test
    public void printFoldRange_4() {
        FoldRangeDemo.printFoldRange("1,2,3,4,6,7,8,9,10,13,14,15,16,17,18,22,23,24");
        assertEquals("1,2,3,4,6,7,8,9,10,13,14,15,16,17,18,22,23,24\r\n1-4,6-10,13-18,22-24\r\n", outStream.toString());
    }

    @Test
    public void printFoldRange_5() {
        FoldRangeDemo.printFoldRange("1,2,4,5,7,8,10,11,13,14,15,16,17,18,19,20,21");
        assertEquals("1,2,4,5,7,8,10,11,13,14,15,16,17,18,19,20,21\r\n1-2,4-5,7-8,10-11,13-21\r\n", outStream.toString());
    }

    @Test
    public void printFoldRange_6() {
        FoldRangeDemo.printFoldRange("1,2,4,5,6,9,10,11,12,16,17,18,19,20,25,26,27,28,29,30");
        assertEquals("1,2,4,5,6,9,10,11,12,16,17,18,19,20,25,26,27,28,29,30\r\n1-2,4-6,9-12,16-20,25-30\r\n", outStream.toString());
    }

    @Test
    public void printFoldRange_7() {
        FoldRangeDemo.printFoldRange("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        assertEquals("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34\r\n1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34\r\n", outStream.toString());
    }

    @Test
    public void printFoldRange_8() {
        FoldRangeDemo.printFoldRange("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        assertEquals("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100\r\n1,3,6,10,15,21,28,36,45,55,66,78,81,95,100\r\n", outStream.toString());
    }

    @Test
    public void printFoldRange_9() {
        FoldRangeDemo.printFoldRange("1,2,4,7,11,12,14,15,16,19,20,21,22");
        assertEquals("1,2,4,7,11,12,14,15,16,19,20,21,22\r\n1-2,4,7,11-12,14-16,19-22\r\n", outStream.toString());
    }

    @Test
    public void printFoldRange_10() {
        FoldRangeDemo.printFoldRange("1,3,4,7,9,13,14,15,20,21,22");
        assertEquals("1,3,4,7,9,13,14,15,20,21,22\r\n1,3-4,7,9,13-15,20-22\r\n", outStream.toString());
    }

    @Test
    public void main() {
        FoldRangeDemo.main(new String[]{""});
        assertEquals("1,3,6,7,9,11,12,13,16,18,20,21,22,23,24,25\r\n1,3,6-7,9,11-13,16,18,20-25\r\n", outStream.toString());
    }
}