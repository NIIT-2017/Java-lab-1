import org.junit.Test;

import static org.junit.Assert.*;

public class FlexibleDeltaSqrtTest extends FlexibleDeltaSqrt{

    @Test
    public void flexDeltaTest() {
        Sqrt sqrt=new Sqrt(3,0.1);
        assertEquals(1.7, sqrt.calc(),0.1);
        assertNotEquals(1.7, sqrt.calc(),0.001);

    }
}