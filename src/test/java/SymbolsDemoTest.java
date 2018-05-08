import static org.junit.Assert.*;

public class SymbolsDemoTest
{
    @org.junit.Test
    public void construct_SEVEN_01234() {
        String[][] numbers = {
                {"   * * *    ", "    *    ", "   * * *    ", "   * * *    ", "       *   "},
                {"  *     *   ", "  * *    ", " *       *  ", " *       *  ", "     * *   "},
                {" *       *  ", "    *    ", "       *    ", "         *  ", "   *   *   "},
                {" *       *  ", "    *    ", "     *      ", "     * *    ", " *     *   "},
                {" *       *  ", "    *    ", "   *        ", "         *  ", " * * * * * "},
                {"  *     *   ", "    *    ", " *          ", " *       *  ", "       *   "},
                {"   * * *    ", "  * * *  ", " * * * * *  ", "   * * *    ", "       *   "}
        };
        assertArrayEquals(numbers, SymbolsDemo.construct(Symbols.ModeLine.SEVEN, "01234"));
    }

    @org.junit.Test
    public void construct_SEVEN_56789() {
        String[][] numbers = {
                {" * * * * *  ", "       *    ", " * * * * *  ", "   * * *    ", "   * * *    "},
                {" *          ", "     *      ", "         *  ", " *       *  ", " *       *  "},
                {" *          ", "   *        ", "       *    ", " *       *  ", " *       *  "},
                {" * * * *    ", " * * * *    ", "     *      ", "   * * *    ", "   * * * *  "},
                {"         *  ", " *       *  ", "   *        ", " *       *  ", "         *  "},
                {"         *  ", " *       *  ", " *          ", " *       *  ", " *       *  "},
                {" * * * *    ", "   * * *    ", " *          ", "   * * *    ", "   * * *    "}
        };
        assertArrayEquals(numbers, SymbolsDemo.construct(Symbols.ModeLine.SEVEN, "56789"));
    }

    @org.junit.Test
    public void construct_FIVE_0123456789() {
        String[][] numbers = {
                {"  ***  ", "  *  ", "  ***  ", " ***  ", "    *  ", " ****  ", "   *   ", " ***** ", "  ***  ", "  ***  "},
                {" *   * ", " **  ", " *   * ", "    * ", "   **  ", " *     ", "  *    ", "     * ", " *   * ", " *   * "},
                {" *   * ", "  *  ", "    *  ", "  **  ", "  * *  ", " ****  ", " ****  ", "    *  ", "  ***  ", "  **** "},
                {" *   * ", "  *  ", "  *    ", "    * ", " ***** ", "     * ", " *   * ", "   *   ", " *   * ", "     * "},
                {"  ***  ", " *** ", " ***** ", " ***  ", "    *  ", " ****  ", "  ***  ", "   *   ", "  ***  ", "  ***  "}
        };
        assertArrayEquals(numbers, SymbolsDemo.construct(Symbols.ModeLine.FIVE, "0123456789"));
    }

    @org.junit.Test
    public void construct_SEVENNUM_123456789() {
        String[][] numbers = {
                {"    1    ", "   2 2 2    ", "   3 3 3    ", "       4   ", " 5 5 5 5 5  ", "       6    ", " 7 7 7 7 7  ", "   8 8 8    ", "   9 9 9    "},
                {"  1 1    ", " 2       2  ", " 3       3  ", "     4 4   ", " 5          ", "     6      ", "         7  ", " 8       8  ", " 9       9  "},
                {"    1    ", "       2    ", "         3  ", "   4   4   ", " 5          ", "   6        ", "       7    ", " 8       8  ", " 9       9  "},
                {"    1    ", "     2      ", "     3 3    ", " 4     4   ", " 5 5 5 5    ", " 6 6 6 6    ", "     7      ", "   8 8 8    ", "   9 9 9 9  "},
                {"    1    ", "   2        ", "         3  ", " 4 4 4 4 4 ", "         5  ", " 6       6  ", "   7        ", " 8       8  ", "         9  "},
                {"    1    ", " 2          ", " 3       3  ", "       4   ", "         5  ", " 6       6  ", " 7          ", " 8       8  ", " 9       9  "},
                {"  1 1 1  ", " 2 2 2 2 2  ", "   3 3 3    ", "       4   ", " 5 5 5 5    ", "   6 6 6    ", " 7          ", "   8 8 8    ", "   9 9 9    "}
        };
        assertArrayEquals(numbers, SymbolsDemo.construct(Symbols.ModeLine.SEVENNUM, "123456789"));
    }

    @org.junit.Test
    public void construct_FIVENUM_12345678() {
        String[][] numbers = {
                {"  1  ", "  222  ", " 333  ", "    4  ", " 5555  ", "   6   ", " 77777 ", "  888  "},
                {" 11  ", " 2   2 ", "    3 ", "   44  ", " 5     ", "  6    ", "     7 ", " 8   8 "},
                {"  1  ", "    2  ", "  33  ", "  4 4  ", " 5555  ", " 6666  ", "    7  ", "  888  "},
                {"  1  ", "  2    ", "    3 ", " 44444 ", "     5 ", " 6   6 ", "   7   ", " 8   8 "},
                {" 111 ", " 22222 ", " 333  ", "    4  ", " 5555  ", "  666  ", "   7   ", "  888  "}
        };
        assertArrayEquals(numbers, SymbolsDemo.construct(Symbols.ModeLine.FIVENUM, "12345678"));
    }

    @org.junit.Test
    public void construct_ONEWORD_1357902468() {
        String[][] numbers = {
                {"ONE ", "THREE ", "FIVE ", "SEVEN ", "NINE ", "ZERO ", "TWO ", "FOUR ", "SIX ", "EIGHT "}
        };
        assertArrayEquals(numbers, SymbolsDemo.construct(Symbols.ModeLine.ONEWORD, "1357902468"));
    }

    @org.junit.Test
    public void construct_ONENUM_1357902468() {
        String[][] numbers = {
                {"1", "3", "5", "7", "9", "0", "2", "4", "6", "8"}
        };
        assertArrayEquals(numbers, SymbolsDemo.construct(Symbols.ModeLine.ONENUM, "1357902468"));
    }

    @org.junit.Test
    public void construct_ONENUM_00_09() {
        String[][] numbers = {
                {"0","0","0","1","0","2","0","3","0","4","0","5","0","6","0","7","0","8","0","9"}
        };
        assertArrayEquals(numbers, SymbolsDemo.construct(Symbols.ModeLine.ONENUM, "00010203040506070809"));
    }
}
