import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void main1() {
        Sqrt sqrt1 = new Sqrt(5, 0.01);
        assertEquals(2.23, sqrt1.calc(), 0.01);
    }

    @Test
    public void main2() {
        Sqrt sqrt2 = new Sqrt(5);
        assertEquals(2.236067977499978, sqrt2.calc(), 0.000000000001);
    }
}