import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt sqrt1 = new Sqrt(25, 0.000000001);
        assertEquals(5, sqrt1.calc(), 0.000000001);
    }
}