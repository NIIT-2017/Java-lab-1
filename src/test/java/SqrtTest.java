import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void calc() {
        Sqrt sqrt = new Sqrt(15);
        assertEquals(false, sqrt.calc(1) < 3.873);
        assertEquals(true, sqrt.calc(2) < 3.873);
    }
}