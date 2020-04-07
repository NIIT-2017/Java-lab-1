import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task5Test {

    @Test
    void addLines() {
        assertEquals("*     *    *      *      ***    *  *    ****    ****      *      ***     ****", task5.addLines("0123456789", 3));
    }
}