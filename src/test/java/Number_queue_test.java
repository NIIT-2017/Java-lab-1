import org.junit.Test;

import static org.junit.Assert.*;


public class Number_queue_test {

    @Test
    public void transfer() {
        assertArrayEquals(new int[]{2,3,4,5},Number_queue.Generating("2-5"));
        assertArrayEquals(new int[]{1},Number_queue.Generating("1"));
    }
}