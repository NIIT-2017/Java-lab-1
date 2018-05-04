import org.junit.Test;

import static org.junit.Assert.*;

public class DeploymentTest {

    @Test
    public void isInteger() {
        String line = "1,3,5-8,12,15-20,23";
        Deployment range = new Deployment(line);
        assertEquals(true, range.isInteger("21"));
    }

    @Test
    public void isInteger2() {
        String line = "1,3,5-8,12,15-20,23";
        Deployment range = new Deployment(line);
        assertEquals(false, range.isInteger("1-3"));
    }

    @Test
    public void printLine() {
        String line = "1,3,5-8,12";
        Deployment range = new Deployment(line);
        assertEquals("1,3,5,6,7,8,12", range.PrintLine());
    }
}