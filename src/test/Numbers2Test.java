import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Numbers2Test {

    @Test
    void fold() {
        assertEquals("1,2,4-7,18-21", Numbers2.UnWrapping("1,2,4,5,6,7,18,19,20,21"));
    }
}
