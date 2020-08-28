import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sqrt_test {
    @Test
    public void calc() {
        Sqrt Sqrt1 = new Sqrt(4,0.1);
        assertEquals(2.0,Sqrt1.calc(), 0.1);
        Sqrt Sqrt2 = new Sqrt(9,0.1);
        assertEquals(3.0,Sqrt2.calc(), 0.1);
    }
}
