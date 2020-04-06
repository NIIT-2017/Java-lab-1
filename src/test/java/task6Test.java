import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task6Test {

    @Test
    void earthAndRope() {
        assertEquals(6378100.078125, task6.earthAndRope(6378.1, 1));
    }

    @Test
    void pool() {
        assertEquals(72256.63103256523, task6.pool(1000, 2000, 1, 3));
    }
}