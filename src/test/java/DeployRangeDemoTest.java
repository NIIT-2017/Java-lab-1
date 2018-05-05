import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DeployRangeDemoTest
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
    public void printDeployRange_1() {
        DeployRangeDemo.printDeployRange("1-24");
        assertEquals("1-24; 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24.", outStream.toString());
    }

    @Test
    public void printDeployRange_2() {
        DeployRangeDemo.printDeployRange("1-12,13-23");
        assertEquals("1-12,13-23; 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23.", outStream.toString());
    }

    @Test
    public void printDeployRange_3() {
        DeployRangeDemo.printDeployRange("1-8,9-16,17-22");
        assertEquals("1-8,9-16,17-22; 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22.", outStream.toString());
    }

    @Test
    public void printDeployRange_4() {
        DeployRangeDemo.printDeployRange("1-6,7-12,13-18,19-21");
        assertEquals("1-6,7-12,13-18,19-21; 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21.", outStream.toString());
    }

    @Test
    public void printDeployRange_5() {
        DeployRangeDemo.printDeployRange("1-4,5-8,9-12,13-16,17-20");
        assertEquals("1-4,5-8,9-12,13-16,17-20; 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20.", outStream.toString());
    }

    @Test
    public void printDeployRange_6() {
        DeployRangeDemo.printDeployRange("1-2,3,4-5,6,7,8-9,10-11,12,13,14-16,17-19");
        assertEquals("1-2,3,4-5,6,7,8-9,10-11,12,13,14-16,17-19; 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19.", outStream.toString());
    }

    @Test
    public void printDeployRange_7() {
        DeployRangeDemo.printDeployRange("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34");
        assertEquals("1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34; 1,3,5,7,9,11,13,15,17,19,22,24,26,28,30,32,34.", outStream.toString());
    }

    @Test
    public void printDeployRange_8() {
        DeployRangeDemo.printDeployRange("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100");
        assertEquals("1,3,6,10,15,21,28,36,45,55,66,78,81,95,100; 1,3,6,10,15,21,28,36,45,55,66,78,81,95,100.", outStream.toString());
    }

    @Test
    public void printDeployRange_9() {
        DeployRangeDemo.printDeployRange("1,2,4,7,11-12,14-16,19-22");
        assertEquals("1,2,4,7,11-12,14-16,19-22; 1,2,4,7,11,12,14,15,16,19,20,21,22.", outStream.toString());
    }

    @Test
    public void printDeployRange_10() {
        DeployRangeDemo.printDeployRange("1,3-4,7,9,13-15,20,21-22");
        assertEquals("1,3-4,7,9,13-15,20,21-22; 1,3,4,7,9,13,14,15,20,21,22.", outStream.toString());
    }

    @Test
    public void printDeployRange_11() {
        DeployRangeDemo.printDeployRange("1,2,3,5,8,10-11,13-15,18-22,23-28");
        assertEquals("1,2,3,5,8,10-11,13-15,18-22,23-28; 1,2,3,5,8,10,11,13,14,15,18,19,20,21,22,23,24,25,26,27,28.", outStream.toString());
    }
}
