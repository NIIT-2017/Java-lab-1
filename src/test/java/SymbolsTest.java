import static org.junit.Assert.*;

public class SymbolsTest
{
    @org.junit.Test
    public void strArr_0246813579() {
        String[] strArr = {"0","2","4","6","8","1","3","5","7","9"};
        String string = "0246813579";
        assertArrayEquals(strArr, Symbols.strArr(string));
    };

    @org.junit.Test
    public void arr_0246813579() {
        int[] arr = {0,2,4,6,8,1,3,5,7,9};
        String[] strArr = {"0","2","4","6","8","1","3","5","7","9"};
        assertArrayEquals(arr, Symbols.arr(strArr));
    }

    @org.junit.Test
    public void getLineCount_SEVEN_12345678() {
        Symbols.setSymbols(Symbols.ModeLine.SEVEN, "12345678");
        assertEquals(7, Symbols.getLineCount());
    }

    @org.junit.Test
    public void getLineCount_FIVE_12345678() {
        Symbols.setSymbols(Symbols.ModeLine.FIVE, "12345678");
        assertEquals(5, Symbols.getLineCount());
    }

    @org.junit.Test
    public void getColCount_SEVEN_12345678() {
        Symbols.setSymbols(Symbols.ModeLine.SEVEN, "12345678");
        assertEquals(8, Symbols.getColCount());
    }

    @org.junit.Test
    public void getColCount_FIVE_12345678() {
        Symbols.setSymbols(Symbols.ModeLine.FIVE, "12345678");
        assertEquals(8, Symbols.getColCount());
    }

    @org.junit.Test
    public void getSymbol_SEVEN_0() {
        Symbols.setSymbols(Symbols.ModeLine.SEVEN, "0");
        assertEquals("   * * *    ", Symbols.getSymbol(0,0));
    }

    @org.junit.Test
    public void getSymbols_SEVEN_0() {
        Symbols.setSymbols(Symbols.ModeLine.SEVEN, "0");
        String[][] symbols = {
                {"   * * *    "},
                {"  *     *   "},
                {" *       *  "},
                {" *       *  "},
                {" *       *  "},
                {"  *     *   "},
                {"   * * *    "}
        };
        assertArrayEquals(symbols, Symbols.getSymbols());
    }

    @org.junit.Test
    public void numbers_SEVEN_0() {
        String[][] numbers = {
                {"   * * *    "},
                {"  *     *   "},
                {" *       *  "},
                {" *       *  "},
                {" *       *  "},
                {"  *     *   "},
                {"   * * *    "}
        };
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.SEVEN, "0"));
    }

    @org.junit.Test
    public void numbers_SEVEN_1() {
        String[][] numbers = {
                {"    *    "},
                {"  * *    "},
                {"    *    "},
                {"    *    "},
                {"    *    "},
                {"    *    "},
                {"  * * *  "}
        };
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.SEVEN, "1"));
    }

    @org.junit.Test
    public void numbers_FIVE_2() {
        String[][] numbers = {
                {"  ***  "},
                {" *   * "},
                {"    *  "},
                {"  *    "},
                {" ***** "}
            };
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.FIVE, "2"));
    }

    @org.junit.Test
    public void numbers_SEVENNUM_3() {
        String[][] numbers = {
                {"   3 3 3    "},
                {" 3       3  "},
                {"         3  "},
                {"     3 3    "},
                {"         3  "},
                {" 3       3  "},
                {"   3 3 3    "}
        };
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.SEVENNUM, "3"));
    }

    @org.junit.Test
    public void numbers_FIVENUM_4() {
        String[][] numbers = {
                {"    4  "},
                {"   44  "},
                {"  4 4  "},
                {" 44444 "},
                {"    4  "}
        };
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.FIVENUM, "4"));
    }

    @org.junit.Test
    public void numbers_ONEWORD_5() {
        String[][] numbers = {{"FIVE "}};
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.ONEWORD, "5"));
    }

    @org.junit.Test
    public void numbers_ONENUM_6() {
        String[][] numbers = {{"6"}};
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.ONENUM, "6"));
    }

    @org.junit.Test
    public void numbers_ONEWORD_13579() {
        String[][] numbers = {{"ONE ", "THREE ", "FIVE ", "SEVEN ", "NINE "}};
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.ONEWORD, "13579"));
    }

    @org.junit.Test
    public void numbers_ONENUM_0246813579() {
        String[][] numbers = {{"0","2","4","6","8","1","3","5","7","9"}};
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.ONENUM, "0246813579"));
    }

    @org.junit.Test
    public void numbers_FIVENUM_0123456789() {
        String[][] numbers = {
                {"  000  ", "  1  ", "  222  ", " 333  ", "    4  ", " 5555  ", "   6   ", " 77777 ", "  888  ", "  999  "},
                {" 0   0 ", " 11  ", " 2   2 ", "    3 ", "   44  ", " 5     ", "  6    ", "     7 ", " 8   8 ", " 9   9 "},
                {" 0   0 ", "  1  ", "    2  ", "  33  ", "  4 4  ", " 5555  ", " 6666  ", "    7  ", "  888  ", "  9999 "},
                {" 0   0 ", "  1  ", "  2    ", "    3 ", " 44444 ", "     5 ", " 6   6 ", "   7   ", " 8   8 ", "     9 "},
                {"  000  ", " 111 ", " 22222 ", " 333  ", "    4  ", " 5555  ", "  666  ", "   7   ", "  888  ", "  999  "}
        };
        assertArrayEquals(numbers, Symbols.numbers(Symbols.ModeLine.FIVENUM, "0123456789"));
    }
}
