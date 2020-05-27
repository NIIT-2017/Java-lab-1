package task2;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtTest {

    @Test
    public void calc() {
        Sqrt Sqrt1 = new Sqrt(1,0.1);
        assertEquals(1.0,Sqrt1.calc());
        Sqrt Sqrt2 = new Sqrt(4,0.1);
        assertEquals(2.0,Sqrt2.calc(), 0.1);
        Sqrt Sqrt3 = new Sqrt(9,0.1);
        assertEquals(3.0,Sqrt3.calc(), 0.1);
    }
}