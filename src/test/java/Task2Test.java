import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @org.junit.jupiter.api.Test
    void calc() {
        Sqrt test = new Sqrt (16, 0.1);
        assertEquals(4, test.calc (), 0.1);
    }
} 