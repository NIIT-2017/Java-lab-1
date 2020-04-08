  import org.junit.Test;

import static org.junit.Assert.*;

public class Task5Test {

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