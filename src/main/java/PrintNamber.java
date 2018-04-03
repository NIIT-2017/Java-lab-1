public class PrintNamber {
    private static String[] arrStrSumm(String[] arrStr1, String[] arrStr2) {
        String[] arrStrOut = new String[arrStr1.length];
        for (int i = 0; i < arrStr1.length; i++) {
            arrStrOut[i] = arrStr1[i] + arrStr2[i];
        }
        return arrStrOut;
    }

    public static void main(String[] args) {
        String[] namber0 = new String[]{"  ***   ",
                " *   *  ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *   *  ",
                "  ***   "};

        String[] namber1 = new String[]{" *  ",
                "**  ",
                " *  ",
                " *  ",
                " *  ",
                " *  ",
                "*** "};

        String[] namber2 = new String[]{" ***  ",
                "*   * ",
                "*  *  ",
                "  *   ",
                " *    ",
                "*     ",
                "***** ",};

        String[] namber3 = new String[]{" ***  ",
                "*   * ",
                "    * ",
                "  **  ",
                "    * ",
                "*   *  ",
                " ***  ",};

        String[] namber4 = new String[]{"   *   ",
                "  **   ",
                " * *   ",
                "*  *   ",
                "****** ",
                "   *   ",
                "   *   ",};

        String[] namber5 = new String[]{" *****  ",
                " *      ",
                " ****   ",
                "     *  ",
                "      * ",
                "*    *  ",
                " ****   ",};

        String[] namber6 = new String[]{" ****   ",
                "*    *  ",
                "*       ",
                "*****   ",
                "*    *  ",
                "*    *  ",
                " ****   ",};

        String[] namber7 = new String[]{"***** ",
                "    * ",
                "   *  ",
                "  *   ",
                " *    ",
                "*     ",
                "*     ",};

        String[] namber8 = new String[]{" ***  ",
                "*   * ",
                "*   * ",
                " ***  ",
                "*   * ",
                "*   * ",
                " ***  ",};

        String[] namber9 = new String[]{" **** ",
                "*   * ",
                "*   * ",
                " **** ",
                "    * ",
                "    * ",
                "    * ",};

        String[][] biblChar = {namber0, namber1, namber2, namber3, namber4, namber5, namber6, namber7, namber8, namber9};
        String[] arrChar = args[0].split("");
        String[] strOutput = {"", "", "", "", "", "", ""};
        int[] arrIntInput = new int[arrChar.length];
        for (int i = 0; i < arrChar.length; i++) {
            arrIntInput[i] = Integer.parseInt(arrChar[i]);
        }

        for (int i = 0; i < arrChar.length; i++) {
            strOutput = arrStrSumm(strOutput, biblChar[arrIntInput[i]]);
        }
        for (int i = 0; i < strOutput.length; i++) {
            System.out.print(strOutput[i] + "\n");
        }
    }
}
