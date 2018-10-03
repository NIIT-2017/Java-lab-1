package sqrt;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {
    @Test
    public void testCalc() throws Exception {
        Sqrt sqrt = new Sqrt(4, 0.001);
        double rez = sqrt.calc();
        Assert.assertEquals(rez, 2.0, 0.001);
    }
}