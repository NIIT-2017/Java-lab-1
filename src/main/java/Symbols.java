public class Symbols
{
    static final int lineCount=7;
    private static String[][] symbolsNumbers = {
        {"   * * *   ","     *     ","   * * *    ","   * * *    ","       *     "," * * * * *  ","       *    "," * * * * *  ","   * * *    ","   * * *    "},
        {"  *     *  ","   * *     "," *       *  "," *       *  ","     * *     "," *          ","     *      ","         *  "," *       *  "," *       *  "},
        {" *       * ","     *     ","       *    ","         *  ","   *   *     "," *          ","   *        ","       *    "," *       *  "," *       *  "},
        {" *       * ","     *     ","     *      ","     * *    "," *     *     "," * * * *    "," * * * *    ","     *      ","   * * *    ","   * * * *  "},
        {" *       * ","     *     ","   *        ","         *  "," * * * * * * ","         *  "," *       *  ","   *        "," *       *  ","         *  "},
        {"  *     *  ","     *     "," *          "," *       *  ","       *     ","         *  "," *       *  "," *          "," *       *  "," *       *  "},
        {"   * * *   ","   * * *   "," * * * * *  ","   * * *    ","       *     "," * * * *    ","   * * *    "," *          ","   * * *    ","   * * *    "}
    };
    public static void symbols(String str) {
        String strArr[] = str.split("");
        for(int line = 0; line < lineCount; line++) {
            for(int num = 0; num < strArr.length; num++) {
                int col = Integer.parseInt(strArr[num]);
                System.out.print(symbolsNumbers[line][col]);
            }
            System.out.print("\n");
        }
    }
}
