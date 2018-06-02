import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt sqrt=new Sqrt(3,0.001);
        assertEquals(1.7321428571428572, sqrt.calc(),0.001);
    }
}

