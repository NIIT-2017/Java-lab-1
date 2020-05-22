import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void calcD() {
        Sqrt sqrt = new Sqrt(4.0d);
        Double result = sqrt.calcD();
        assertEquals(true, result.equals(2.000000000000002));
    }

    @Test
    public void calcF() {
        Sqrt sqrt = new Sqrt(4.0f);
        Float result = sqrt.calcF();
        assertEquals(true, result.equals(2.0f));
    }
}