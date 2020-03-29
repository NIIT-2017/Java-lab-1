import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void calcDouble() {
        Sqrt sqrt = new Sqrt(2.0d);
        Double result = sqrt.calcDouble();
        //result.equals(1.4142135623746899);
        Assert.assertEquals(true, result.equals(1.4142135623746899));
    }
    @Test
    public void calcFloat() {
        Sqrt sqrt = new Sqrt(2.0f);
        Float result = sqrt.calcFloat();
        Assert.assertEquals(true, result.equals(1.4142135f));

    }
}