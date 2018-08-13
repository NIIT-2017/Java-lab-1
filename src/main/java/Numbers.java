
public class Numbers {
    private static String[] builder(String[] arr1, String[] arr2) {
        String[] arrStrOut = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrStrOut[i] = arr1[i] + arr2[i];
        }
        return arrStrOut;
    }

    public static void main(String[] args) {
        String[] number0 = new String[]{
                "  ***   ",
                " *   *  ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *   *  ",
                "  ***   "};

        String[] number1 = new String[]{
                " *  ",
                "**  ",
                " *  ",
                " *  ",
                " *  ",
                " *  ",
                "*** "};

        String[] number2 = new String[]{
                " ***  ",
                "*   * ",
                "*  *  ",
                "  *   ",
                " *    ",
                "*     ",
                "***** ",};

        String[] number3 = new String[]{
                " ***  ",
                "*   * ",
                "    * ",
                "  **  ",
                "    * ",
                "*   *  ",
                " ***  ",};

        String[] number4 = new String[]{
                "   *   ",
                "  **   ",
                " * *   ",
                "*  *   ",
                "****** ",
                "   *   ",
                "   *   ",};

        String[] number5 = new String[]{
                " *****  ",
                " *      ",
                " ****   ",
                "     *  ",
                "      * ",
                "*    *  ",
                " ****   ",};

        String[] number6 = new String[]{
                " ****   ",
                "*    *  ",
                "*       ",
                "*****   ",
                "*    *  ",
                "*    *  ",
                " ****   ",};

        String[] number7 = new String[]{
                "***** ",
                "    * ",
                "   *  ",
                "  *   ",
                " *    ",
                "*     ",
                "*     ",};

        String[] number8 = new String[]{
                " ***  ",
                "*   * ",
                "*   * ",
                " ***  ",
                "*   * ",
                "*   * ",
                " ***  ",};

        String[] number9 = new String[]{
                " **** ",
                "*   * ",
                "*   * ",
                " **** ",
                "    * ",
                "    * ",
                "    * ",};

        String[][] list = {number0, number1, number2, number3, number4, number5, number6, number7, number8, number9};
        String str="1245";
        String[] stroka = str.split("");
        String[] strOutput = {"", "", "", "", "", "", ""};
        int[] strInput = new int[stroka.length];
        for (int i = 0; i < stroka.length; i++) {
            strInput[i] = Integer.parseInt(stroka[i]);
        }

        for (int i = 0; i < stroka.length; i++) {
            strOutput = builder(strOutput, list[strInput[i]]);
        }
        for (int i = 0; i < strOutput.length; i++) {
            System.out.print(strOutput[i] + "\n");
        }
    }
}
