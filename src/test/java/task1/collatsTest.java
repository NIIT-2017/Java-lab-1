package task1;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class collatsTest {

    @Test
    public void metodCollats() {
        assertEquals(1, collats.metodCollats(1));
        assertEquals(525, collats.metodCollats(837799));
        assertEquals(21, collats.metodCollats(19));
        assertEquals(112, collats.metodCollats(27));
        assertEquals(179, collats.metodCollats(871));
    }
}