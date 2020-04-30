import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task5Test {

    @Test
    void numberDrawing() {
        assertEquals("13579","    *    ***    *****  *****  **** ",task5.numberDrawing("13579",0));
    }
}