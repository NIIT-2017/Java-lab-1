import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt sqrt = new Sqrt(9.0);
        double result = Sqrt.calc();
        assertEquals(3.000000001396984, Sqrt.calc(), 0.00000001);
        Sqrt.delta = 1.0;
        assertEquals(3.023529411764706, Sqrt.calc(), 1.0);
        Sqrt.delta = 0.000000001;
        assertEquals(3.0, Sqrt.calc(), 0.000000001);
    }
}