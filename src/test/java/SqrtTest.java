import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void calc() {
        Sqrt sqrt = new Sqrt(9.0);
        double result = Sqrt.calc();
        assertEquals(3.000000001396984, Sqrt.calc());
        Sqrt.delta = 1.0;
        assertEquals(3.023529411764706, Sqrt.calc());
        Sqrt.delta = 0.000000001;
        assertEquals(3.0, Sqrt.calc());
    }
}