import org.junit.Test;

import static org.junit.Assert.*;

public class EarthTest {

    @Test
    public void earth() {
        assertEquals(0.159,Earth.earth(63781000),0.001);

        assertNotEquals(0.161,Earth.earth(63781000),0.001);
    }
}
