import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    void find() {
        assertArrayEquals(new int[]{1}, Task3.find("1"));
        assertArrayEquals(new int[]{2,3,4,5,6,7}, Task3.find("2-7"));
        assertArrayEquals(new int[]{8,9,10,11,12,13,14,15}, Task3.find("8,9,10-14,15"));
    }
}