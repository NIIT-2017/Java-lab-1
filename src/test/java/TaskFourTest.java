import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFourTest {

    @Test
    public void compress() {
        assertEquals(TaskFour.compress("2,4,5,6,7,18,19,20,21,23,24,25,26"),
                "2,4-7,18-21,23-26");
    }
}