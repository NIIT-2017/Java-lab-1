  import org.junit.Test;

import static org.junit.Assert.*;

class Task5Test {

    @Test
    public void makeLine() {
        assertArrayEquals(new String[]{
                "   *     *     ***    *****   ***    ***    *    ****  ",
                "  **    **    *   *       *  *   *  *   *  **   *   *  ",
                " * *     *   *     *     *   *  *   *   *   *   *   *  ",
                "*  *     *   *     *    *      *     ***    *    ****  ",
                "******   *   *     *   *      *     *   *   *       *  ",
                "   *     *    *   *   *      *      *   *   *       *  ",
                "   *    ***    ***    *      *****   ***   ***      *  "},
                Task5.makeLine("41072819"));
    }
}