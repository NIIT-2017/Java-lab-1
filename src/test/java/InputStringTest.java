import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputStringTest {

    @Test
    public void DigitsPrinting() {
        String[] strOutputs1 = new String[]
                       {"  ***     *  ",
                        " *   *   **   ",
                        "*     *   *   ",
                        "*     *   *   ",
                        "*     *   *   ",
                        " *   *    *   ",
                        "  ***    ***  "};
        String args1 = "01";

        assertEquals(strOutputs1, InputString.DigitsPrinting(args1));


        String[] strOutputs2 = new String[]
                       {"  ***     *     ***   ***      ***",
                        " *   *   **    *   *  *   *  *   * ",
                        "*     *   *    *  *       *  *     ",
                        "*     *   *      *     ***   ****  ",
                        "*     *   *     *         *  *   * ",
                        " *   *    *    *      *   *  *   * ",
                        "  ***    ***   *****   ***    ***  "};
        String args2 = "01236";
        assertEquals(strOutputs2, InputString.DigitsPrinting(args2));


  String[] strOutputs3 = new String[]{"  *** ",
          " *   * ",
          "     * ",
          "   *   ",
          "   *   ",
          "       ",
          "   **  "};
    String args3 = "a";
    assertEquals(strOutputs3, InputString.DigitsPrinting(args3));
    }
}