package task3;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NambersTest {

    @Test
    public void transfer() {
        assertArrayEquals(new int[]{2,3,4,5},Nambers.transfer("2-5"));
        assertArrayEquals(new int[]{1},Nambers.transfer("1"));
    }
}