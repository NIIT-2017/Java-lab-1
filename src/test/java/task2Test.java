import org.junit.Test;

import static org.junit.Assert.*;

public class task2Test {

    @Test
    public void sqrt() {
        assertEquals(4.0, task2.Sqrt(16.0, 0.00000001), 0.00000001);
    }
}