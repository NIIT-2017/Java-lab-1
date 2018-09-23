import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        assertEquals(4.0,Calculator.add(2.0,2.0),0.0001);
    }

    @Test
    public void sub() {
        assertEquals(0.0,Calculator.sub(2.0,2.0),0.0001);
    }

    @Test
    public void mul() {
        assertEquals(4.0,Calculator.mul(2.0,2.0),0.0001);
    }

    @Test
    public void div() {
        assertEquals(1.0,Calculator.div(2.0,2.0),0.0001);
    }

    @Test
    public void exp() {
        double result=Calculator.exp(2.0,2.0);
        assertTrue(result>=0 && result<5.0);
        assertEquals(4.0,Calculator.exp(2.0,2.0),0.0001);
    }
    @Test(timeout=1000)
    public void testTime() {
        while(true);
    }

}