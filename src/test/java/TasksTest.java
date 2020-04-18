import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    void earthAndRope() {
        double d = (Math.PI * 2 + 1) / (Math.PI * 2) - 1;
        assertEquals(true, Math.abs(d - Tasks.EarthAndRope(1)) < 0.000000001);
    }

    @Test
    void poolBeautification() {
        assertEquals(72256, (int)Tasks.PoolBeautification(3));
    }
}