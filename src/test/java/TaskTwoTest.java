import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTwoTest {

    @Test
    public void sqrt() {
        assertEquals(TaskTwo.sqrt(16.0), 4.0, 0.1);
    }

    @Test
    public void round() {
        assertEquals(TaskTwo.round(23.32323232, 2), 23.32, 0.1);
    }
}