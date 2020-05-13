//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class TasksTest {

    @Test
    public void earthAndRope() {
        double d = (Math.PI * 2 + 1) / (Math.PI * 2) - 1;
        assertTrue(Math.abs(d - Tasks.EarthAndRope(1)) < 0.000000001);
    }

    @Test
    public void poolBeautification() {
        assertEquals(72256, (int)Tasks.PoolBeautification(3));
    }
}