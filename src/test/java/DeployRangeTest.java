import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DeployRangeTest
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
    public void deployRange_1() {
        DeployRange.deployRange("1-24");
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24\r\n", outStream.toString());
    }

    @Test
    public void deployRange_2() {
        DeployRange.deployRange("1-12,13-23");
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23\r\n", outStream.toString());
    }

    @Test
    public void deployRange_3() {
        DeployRange.deployRange("1-8,9-16,17-22");
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22\r\n", outStream.toString());
    }

    @Test
    public void deployRange_4() {
        DeployRange.deployRange("1-6,7-12,13-18,19-21");
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21\r\n", outStream.toString());
    }

    @Test
    public void deployRange_5() {
        DeployRange.deployRange("1-4,5-8,9-12,13-16,17-20");
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20\r\n", outStream.toString());
    }

    @Test
    public void deployRange_6() {
        DeployRange.deployRange("1-2,3,4-5,6,7,8-9,10-11,12,13,14-16,17-19");
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19\r\n", outStream.toString());
    }

    @Test
    public void deployRange_7() {
        DeployRange.deployRange("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        assertEquals("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34\r\n", outStream.toString());
    }

    @Test
    public void deployRange_8() {
        DeployRange.deployRange("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        assertEquals("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100\r\n", outStream.toString());
    }

    @Test
    public void deployRange_9() {
        DeployRange.deployRange("1,2,4,7,11-12,14-16,19-22");
        assertEquals("1,2,4,7,11,12,14,15,16,19,20,21,22\r\n", outStream.toString());
    }

    @Test
    public void deployRange_10() {
        DeployRange.deployRange("1,3-4,7,9,13-15,20,21-22");
        assertEquals("1,3,4,7,9,13,14,15,20,21,22\r\n", outStream.toString());
    }
}