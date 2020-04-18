//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt sqrt = new Sqrt(15);
        assertFalse(sqrt.calc(1) < 3.873);
        assertTrue(sqrt.calc(2) < 3.873);
    }
}