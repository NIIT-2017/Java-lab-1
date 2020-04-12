import org.junit.Test;

import static org.junit.Assert.*;

class SqrtTest {
    double delta = 0.0000001;

    @Test
    void calc() {
        Sqrt sqtr1 = new Sqrt(1,5);
        assertEquals(2.3333333333333335, sqtr1.calc());
    }
    @Test
    void calc1() {
        Sqrt sqtr1 = new Sqrt(0.1, 16000);
        assertEquals(126.49112992155585, sqtr1.calc());
    }
    @Test
    void calc2() {
        Sqrt sqtr1 = new Sqrt(0.002, 121);
        assertEquals(11.000000001611474, sqtr1.calc());
    }
}