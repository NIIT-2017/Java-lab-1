public class Num2SymArr {
    private static String[] digit2SymArr(char digit) {
        switch (digit) {
            case '0':
                String[] symArr0 = {"  ***  ",
                                    " *   * ",
                                    "*     *",
                                    "*     *",
                                    "*     *",
                                    " *   * ",
                                    "  ***  "};
                return symArr0;
            case '1':
                String[] symArr1 = {"   *   ",
                                    "  **   ",
                                    " * *   ",
                                    "   *   ",
                                    "   *   ",
                                    "   *   ",
                                    " ***** "};
                return symArr1;
            case '2':
                String[] symArr2 = {"  ***  ",
                                    " *   * ",
                                    " *  *  ",
                                    "   *   ",
                                    "  *    ",
                                    " *     ",
                                    " ***** "};
                return symArr2;
            case '3':
                String[] symArr3 = {"  ***  ",
                                    " *   * ",
                                    "     * ",
                                    "  ***  ",
                                    "     * ",
                                    " *   * ",
                                    "  ***  "};
                return symArr3;
            case '4':
                String[] symArr4 = {"    *  ",
                                    "   **  ",
                                    "  * *  ",
                                    " *  *  ",
                                    "****** ",
                                    "    *  ",
                                    "    *  "};
                return symArr4;
            case '5':
                String[] symArr5 = {" ***** ",
                                    " *     ",
                                    " *     ",
                                    " ****  ",
                                    "     * ",
                                    " *   * ",
                                    "  ***  "};
                return symArr5;
            case '6':
                String[] symArr6 = {"  ***  ",
                                    " *   * ",
                                    " *     ",
                                    " ****  ",
                                    " *   * ",
                                    " *   * ",
                                    "  ***  "};
                return symArr6;
            case '7':
                String[] symArr7 = {" ***** ",
                                    "     * ",
                                    "    *  ",
                                    "   *   ",
                                    "  *    ",
                                    " *     ",
                                    " *     "};
                return symArr7;
            case '8':
                String[] symArr8 = {"  ***  ",
                                    " *   * ",
                                    " *   * ",
                                    "  ***  ",
                                    " *   * ",
                                    " *   * ",
                                    "  ***  "};
                return symArr8;
            case '9':
                String[] symArr9 = {"  ***  ",
                                    " *   * ",
                                    " *   * ",
                                    "  **** ",
                                    "     * ",
                                    " *   * ",
                                    "  ***  "};
                return symArr9;
            default:
                String[] symArrN = {"*     *",
                                    "**    *",
                                    "* *   *",
                                    "*  *  *",
                                    "*   * *",
                                    "*    **",
                                    "*     *"};
                return symArrN;
        }
    }
    public static String[] num2SymArr(int num) {
        String intArr = Integer.toString(num);
        String[] symArr = new String[7];
        for (int i = 0; i < 7; i++)
            symArr[i] = "";

        for (int k = 0; k < intArr.length(); k++) {
            String[] symArrCurr = digit2SymArr(intArr.charAt(k));
            for (int i = 0; i < 7; i++)
                symArr[i] = symArr[i].concat(symArrCurr[i]);
        }
        return symArr;
    }
    /*public static void main(String args[]) {
        String strIn = args[0];
        num2SymArr(Integer.parseInt(strIn));
    }*/
}
