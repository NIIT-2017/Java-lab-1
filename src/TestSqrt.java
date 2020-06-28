import static org.junit.Assert.*;

public class TestSqrt {
    @org.junit.Test
    public void calc() {
        Sqrt sqrtTest = new Sqrt(100, 0.000000001);
        assertEquals(10, sqrtTest.calc(), 0.000000001);
    }
}