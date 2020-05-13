import org.junit.Test;

import static org.junit.Assert.*;

public class SqrTest {

    @Test
    public void calc() {
        Sqr sqrt1 = new Sqr(9,0.1);
        assertEquals(3.0,sqrt1.calc(),0.1);

        Sqr sqrt2 = new Sqr(16,0.00000001);
        assertEquals(4.0000000,sqrt2.calc(),0.00000001);

        Sqr sqrt3 = new Sqr(25,0.5);
        assertEquals(5.01524760,sqrt3.calc(),0.00000001);
    }
}