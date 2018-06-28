package DrawNumber;


public class HelpMethods {
    static String[] callNumber(int num) {
        switch (num) {
            case '0':
                String[] num0 =
                                   {"  ***  ",
                                    " *   * ",
                                    "*     *",
                                    "*     *",
                                    "*     *",
                                    " *   * ",
                                    "  ***  "};
                return num0;

            case '1':
                String[] num1 =
                               {"   *   ",
                                "  **   ",
                                "   *   ",
                                "   *   ",
                                "   *   ",
                                "   *   ",
                                "  ***  "};
                return num1;

            case '2':
                String[] num2 =
                               {"  ***  ",
                                " *   * ",
                                " *  *  ",
                                "   *   ",
                                "  *    ",
                                " *     ",
                                " ***** "};
                return num2;

            case '3':
                String[] num3 =
                               {"  ***  ",
                                " *   * ",
                                "     * ",
                                "  ***  ",
                                "     * ",
                                " *   * ",
                                "  ***  "};


                return num3;


            case '4':
                String[] num4 =
                               {"    *  ",
                                "   **  ",
                                "  * *  ",
                                " *  *  ",
                                "****** ",
                                "    *  ",
                                "    *  "};
                return num4;

            case '5':


                String[] num5 =
                               {" ****  ",
                                " *     ",
                                " *     ",
                                " ****  ",
                                "     * ",
                                " *   * ",
                                "  ***  "};
                return num5;

            case '6':
                String[] num6 =
                               {"  ***  ",
                                " *   * ",
                                " *     ",
                                " ****  ",
                                " *   * ",
                                " *   * ",
                                "  ***  "};
                return num6;

            case '7':
                String[] num7 =
                               {" ***** ",
                                "     * ",
                                "    *  ",
                                "   *   ",
                                "  *    ",
                                " *     ",
                                " *     "};
                return num7;

            case '8':
                String[] num8 =
                               {"  ***  ",
                                " *   * ",
                                " *   * ",
                                "  ***  ",
                                " *   * ",
                                " *   * ",
                                "  ***  "};
                return num8;

            case '9':
                String[] num9 =
                        {"  ***  ",
                         " *   * ",
                         " *   * ",
                         "  **** ",
                         "     * ",
                         " *   * ",
                         "  ***  "};
                return num9;

            default:
                String[] wat = {"wat?"};
                return wat;
        }
    }
}
