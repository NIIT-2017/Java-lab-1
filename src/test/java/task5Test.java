import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task5Test {

    @Test
    void addLines() {
        assertEquals("  ***      *     ***     ***       *    *****    ***    *****    ***     *** ", task5.addLines("0123456789", 0));
        assertEquals(" *   *    **    *   *   *   *     **    *       *   *       *   *   *   *   *", task5.addLines("0123456789", 1));
        assertEquals("*     *    *    *  *        *    * *    *       *          *    *   *   *   *", task5.addLines("0123456789", 2));
        assertEquals("*     *    *      *      ***    *  *    ****    ****      *      ***     ****", task5.addLines("0123456789", 3));
        assertEquals("*     *    *     *          *   *****       *   *   *    *      *   *       *", task5.addLines("0123456789", 4));
        assertEquals(" *   *     *    *       *   *      *    *   *   *   *   *       *   *   *   *", task5.addLines("0123456789", 5));
        assertEquals("  ***     ***   *****    ***       *     ***     ***    *        ***     *** ", task5.addLines("0123456789", 6));

    }
}