import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task5Test {

    @Test
    void makeLine() {
        assertArrayEquals(new String[]{
                "   *     *     ***    *****   ***    ***    *    ****  ",
                "  **    **    *   *       *  *   *  *   *  **   *   *  ",
                " * *     *   *     *     *   *  *   *   *   *   *   *  ",
                "*  *     *   *     *    *      *     ***    *    ****  ",
                "******   *   *     *   *      *     *   *   *       *  ",
                "   *     *    *   *   *      *      *   *   *       *  ",
                "   *    ***    ***    *      *****   ***   ***      *  "},
                task5.makeLine("41072819"));
    }
}