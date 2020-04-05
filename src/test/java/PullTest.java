import org.junit.Test;

import static org.junit.Assert.*;

public class PullTest {

    @Test
    public void costtrack() {
        assertEquals(21991.15,Pull.costtrack(1000),0.01);
    }

    @Test
    public void costfence() {
        assertEquals(50265.48,Pull.costfence(2000),0.01);
    }
}
