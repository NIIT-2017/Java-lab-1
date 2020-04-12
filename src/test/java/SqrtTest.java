import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    Sqrt sqrt = new Sqrt(9.0,0.0000000000001);
    @Test
    public void average() {
        assertEquals(3.5,sqrt.average(3.0,4.0));
    }

    @Test
    public void good() {
        assertEquals(true,sqrt.good(2.0,3.999999999999999));
    }

    @Test
    public void improve() {
        assertEquals(1.75,sqrt.improve(2.0,3.0));
    }

    @Test
    public void iter() {
        assertEquals(3.0,sqrt.improve(3.0,9.0));
        assertEquals(2.0,sqrt.improve(2.0,4.0));
    }

    @Test
    public void calc() {
        assertEquals(3.0,sqrt.calc());
    }
}