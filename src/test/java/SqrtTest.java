import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt sq1 = new Sqrt(3,0.4);
        assertEquals(1.75,sq1.calc(), 0.4);
        Sqrt sq2 = new Sqrt(2,1.3);
        assertEquals(1.0,sq2.calc(),1.3);
        Sqrt sq3 = new Sqrt(4.1,2.6);
        assertEquals(2.55,sq3.calc(),2.6);
    }
}