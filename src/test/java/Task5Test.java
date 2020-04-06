import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

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
                Task5.makeLine("41072819"));
    }
}