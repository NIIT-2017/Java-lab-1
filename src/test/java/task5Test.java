import org.junit.Test;
import static org.junit.Assert.*;

public class task5Test {

    @Test
    public void addLines() {
        assertEquals("  ***      *     ***     ***       *    *****    ***    *****    ***     *** ", task5.addLines("0123456789", 0));
        assertEquals(" *   *    **    *   *   *   *     **    *       *   *       *   *   *   *   *", task5.addLines("0123456789", 1));
        assertEquals("*     *    *    *  *        *    * *    *       *          *    *   *   *   *", task5.addLines("0123456789", 2));
        assertEquals("*     *    *      *      ***    *  *    ****    ****      *      ***     ****", task5.addLines("0123456789", 3));
        assertEquals("*     *    *     *          *   *****       *   *   *    *      *   *       *", task5.addLines("0123456789", 4));
        assertEquals(" *   *     *    *       *   *      *    *   *   *   *   *       *   *   *   *", task5.addLines("0123456789", 5));
        assertEquals("  ***     ***   *****    ***       *     ***     ***    *        ***     *** ", task5.addLines("0123456789", 6));

    }
}