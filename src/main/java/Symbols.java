public class Symbols
{
    public enum ModeLine {
        SEVEN, FIVE, SEVENNUM, FIVENUM, ONEWORD, ONENUM
    }
    private static String[][][] symbolsNumbers = {
        {
            {"   * * *    ", "    *    ", "   * * *    ", "   * * *    ", "       *   ", " * * * * *  ", "       *    ", " * * * * *  ", "   * * *    ", "   * * *    "},
            {"  *     *   ", "  * *    ", " *       *  ", " *       *  ", "     * *   ", " *          ", "     *      ", "         *  ", " *       *  ", " *       *  "},
            {" *       *  ", "    *    ", "       *    ", "         *  ", "   *   *   ", " *          ", "   *        ", "       *    ", " *       *  ", " *       *  "},
            {" *       *  ", "    *    ", "     *      ", "     * *    ", " *     *   ", " * * * *    ", " * * * *    ", "     *      ", "   * * *    ", "   * * * *  "},
            {" *       *  ", "    *    ", "   *        ", "         *  ", " * * * * * ", "         *  ", " *       *  ", "   *        ", " *       *  ", "         *  "},
            {"  *     *   ", "    *    ", " *          ", " *       *  ", "       *   ", "         *  ", " *       *  ", " *          ", " *       *  ", " *       *  "},
            {"   * * *    ", "  * * *  ", " * * * * *  ", "   * * *    ", "       *   ", " * * * *    ", "   * * *    ", " *          ", "   * * *    ", "   * * *    "}
        },
        {
            {"  ***  ", "  *  ", "  ***  ", " ***  ", "    *  ", " ****  ", "   *   ", " ***** ", "  ***  ", "  ***  "},
            {" *   * ", " **  ", " *   * ", "    * ", "   **  ", " *     ", "  *    ", "     * ", " *   * ", " *   * "},
            {" *   * ", "  *  ", "    *  ", "  **  ", "  * *  ", " ****  ", " ****  ", "    *  ", "  ***  ", "  **** "},
            {" *   * ", "  *  ", "  *    ", "    * ", " ***** ", "     * ", " *   * ", "   *   ", " *   * ", "     * "},
            {"  ***  ", " *** ", " ***** ", " ***  ", "    *  ", " ****  ", "  ***  ", "   *   ", "  ***  ", "  ***  "}
        },
        {
            {"   0 0 0    ", "    1    ", "   2 2 2    ", "   3 3 3    ", "       4   ", " 5 5 5 5 5  ", "       6    ", " 7 7 7 7 7  ", "   8 8 8    ", "   9 9 9    "},
            {"  0     0   ", "  1 1    ", " 2       2  ", " 3       3  ", "     4 4   ", " 5          ", "     6      ", "         7  ", " 8       8  ", " 9       9  "},
            {" 0       0  ", "    1    ", "       2    ", "         3  ", "   4   4   ", " 5          ", "   6        ", "       7    ", " 8       8  ", " 9       9  "},
            {" 0       0  ", "    1    ", "     2      ", "     3 3    ", " 4     4   ", " 5 5 5 5    ", " 6 6 6 6    ", "     7      ", "   8 8 8    ", "   9 9 9 9  "},
            {" 0       0  ", "    1    ", "   2        ", "         3  ", " 4 4 4 4 4 ", "         5  ", " 6       6  ", "   7        ", " 8       8  ", "         9  "},
            {"  0     0   ", "    1    ", " 2          ", " 3       3  ", "       4   ", "         5  ", " 6       6  ", " 7          ", " 8       8  ", " 9       9  "},
            {"   0 0 0    ", "  1 1 1  ", " 2 2 2 2 2  ", "   3 3 3    ", "       4   ", " 5 5 5 5    ", "   6 6 6    ", " 7          ", "   8 8 8    ", "   9 9 9    "}
        },
        {
            {"  000  ", "  1  ", "  222  ", " 333  ", "    4  ", " 5555  ", "   6   ", " 77777 ", "  888  ", "  999  "},
            {" 0   0 ", " 11  ", " 2   2 ", "    3 ", "   44  ", " 5     ", "  6    ", "     7 ", " 8   8 ", " 9   9 "},
            {" 0   0 ", "  1  ", "    2  ", "  33  ", "  4 4  ", " 5555  ", " 6666  ", "    7  ", "  888  ", "  9999 "},
            {" 0   0 ", "  1  ", "  2    ", "    3 ", " 44444 ", "     5 ", " 6   6 ", "   7   ", " 8   8 ", "     9 "},
            {"  000  ", " 111 ", " 22222 ", " 333  ", "    4  ", " 5555  ", "  666  ", "   7   ", "  888  ", "  999  "}
        },
        {
            {"ZERO ", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE "}
        },
        {
            {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
        }
    };
    private static int lineCount, colCount;
    private static String[][] symbols;
    public static void setSymbols(ModeLine mLine, String string) {
        setParams(mLine.ordinal(), arr(strArr(string)));
    }
    private static void setParams(int o, int[] arr) {
        setLineCount(symbolsNumbers[o].length);
        setColCount(arr.length);
        setSymbolsInside(symNum(o, arr));
    }
    private static void setLineCount(int lCount) {
        lineCount = lCount;
    }
    private static void setColCount(int cCount) {
        colCount = cCount;
    }
    private static void setSymbolsInside(String[][] symNum) {
        symbols = symNum;
    }
    public static int getLineCount() {
        return lineCount;
    }
    public static int getColCount() {
        return colCount;
    }
    public static String[][] getSymbols() {
        return symbols;
    }
    public static String getSymbol(int i, int j) {
        return symbols[i][j];
    }
    public static String[] strArr(String string) {
        return string.split("");
    }
    public static int[] arr(String[] strArr) {
        int[] arr = new int[strArr.length];
        for(int k=0; k < arr.length; k++) arr[k] = Integer.parseInt(strArr[k]);
        return arr;
    }
    public static String[][] symNum(int o, int[] arr) {
        String[][] symNum = new String[lineCount][colCount];
        for(int i=0; i < lineCount; i++) for(int j=0; j < colCount; j++) symNum[i][j] = symbolsNumbers[o][i][arr[j]];
        return symNum;
    }
    public static String[][] numbers(ModeLine mLine, String string) {
        setSymbols(mLine, string);
        return getSymbols();
    }
}
