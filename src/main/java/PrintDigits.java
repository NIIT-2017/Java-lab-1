public class PrintDigits {
    private static final String[] zero = {"  **** ",
                                          " *    *",
                                          " *    *",
                                          " *    *",
                                          " *    *",
                                          " *    *",
                                          "  **** "};
    private static final String[] one =  {"    *  ",
                                          "   **  ",
                                          "    *  ",
                                          "    *  ",
                                          "    *  ",
                                          "    *  ",
                                          "   *** "};
    private static final String[] two =  {"  ***  ",
                                          " *   * ",
                                          "    *  ",
                                          "   *   ",
                                          "  *    ",
                                          " *     ",
                                          " ***** "};
    private static final String[] three = {"  ***  ",
                                           " *   * ",
                                           "     * ",
                                           "  ***  ",
                                           "     * ",
                                           " *   * ",
                                           "  ***  "};
    private static final String[] four = {"    *  ",
                                          "   **  ",
                                          "  * *  ",
                                          " *  *  ",
                                          " ***** ",
                                          "    *  ",
                                          "    *  "};
    private static final String[] five = {" ***** ",
                                          " *     ",
                                          " *     ",
                                          " ****  ",
                                          "     * ",
                                          " *   * ",
                                          "  ***  "};
    private static final String[] six = {"  ***  ",
                                         " *   * ",
                                         " *     ",
                                         " ****  ",
                                         " *   * ",
                                         " *   * ",
                                         "  ***  "};
    private static final String[] seven = {" ***** ",
                                           "     * ",
                                           "    *  ",
                                           "   *   ",
                                           "  *    ",
                                           " *     ",
                                           " *     "};
    private static final String[] eight = {"  ***  ",
                                           " *   * ",
                                           " *   * ",
                                           "  ***  ",
                                           " *   * ",
                                           " *   * ",
                                           "  ***  "};
    private static final String[] nine = {"  ***  ",
                                          " *   * ",
                                          " *   * ",
                                          "  **** ",
                                          "     * ",
                                          " *   * ",
                                          "  ***  "};

    public static void main(String[] args) {
        String[] input = args[0].split("");
        for (int j = 0; j < 7; j++) {
            System.out.print("\n");
            for (int i = 0; i < input.length; i++) {
                switch (input[i]) {
                    case "0":
                        System.out.print(zero[j]);
                        break;
                    case "1":
                        System.out.print(one[j]);
                        break;
                    case "2":
                        System.out.print(two[j]);
                        break;
                    case "3":
                        System.out.print(three[j]);
                        break;
                    case "4":
                        System.out.print(four[j]);
                        break;
                    case "5":
                        System.out.print(five[j]);
                        break;
                    case "6":
                        System.out.print(six[j]);
                        break;
                    case "7":
                        System.out.print(seven[j]);
                        break;
                    case "8":
                        System.out.print(eight[j]);
                        break;
                    case "9":
                        System.out.print(nine[j]);
                        break;
                }
            }
        }
    }
}
