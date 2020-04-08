import org.junit.Test;

import static org.junit.Assert.*;

class Task6Test {

    @Test
    public void earthAndRope() {
        assertEquals(6378100.078125, Task6.earthAndRope(6378.1, 1));
    }

    @Test
    public void pool() {
        assertEquals(72256.63103256523, Task6.pool(1000, 2000, 1, 3));
    }
}