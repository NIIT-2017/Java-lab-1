import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    private double namber = 3.1;
    private int numberOfDecimalPlaces = 3;

    private Sqrt sqrt = new Sqrt(namber, numberOfDecimalPlaces);

    @Test
    public void average() {
        assertEquals(3.05, sqrt.average(3.1, 3.0), 0.0001);
        assertNotEquals(3.04, sqrt.average(3.1, 3.0),0.0001);
    }


    @Test
    public void good() {
        assertTrue(sqrt.good(2.11, 4.452));
        assertFalse(sqrt.good(2.11, 4.4531));
    }


    @Test
    public void improve() {
        assertEquals(1.87258,sqrt.improve(3.1, 2), 0.0001);
        assertNotEquals(1.87358,sqrt.improve(3.1, 2), 0.0001);
    }

    @Test
    public void calcAndIter() {
        Sqrt sqrtTest2 = new Sqrt(3, 5);
        assertEquals(1.7320508075688772935, sqrtTest2.calc(), 0.000001);
        assertNotEquals(1.7320608075688772935, sqrtTest2.calc(), 0.000001);
    }
}