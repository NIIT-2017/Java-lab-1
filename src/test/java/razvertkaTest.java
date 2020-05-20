import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class razvertkaTest {

    @Test
    void zoom() {
        assertArrayEquals(new int[]{1},razvertka.zoom("1"));
        assertArrayEquals(new int[]{2,3,4,5,6,7,8},razvertka.zoom("2-8"));
        assertArrayEquals(new int[]{13,14,15,16,17,18,19,20},razvertka.zoom("13-20"));
    }
}