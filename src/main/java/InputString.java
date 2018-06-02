class InputString {
    public static void main(String[] args) {
        String strInput = args[0];
        //String strInput = "10125";
        String[] strOutputs = DigitsPrinting(strInput);
        for (int i = 0; i < strOutputs.length; i++) {
            System.out.println(strOutputs[i]);
        }
    }

    protected static String[] DigitsPrinting(String strInput) {//определяет соответвие цифры ее изображению и выводит на печать
        String[] strOutput = new String[7];
        for (int i = 0; i < strInput.length(); i++) {
            int digit = strInput.charAt(i);
            String[] strBuf = digitsArr(digit);
            if (i<1){
                strOutput = strBuf;
            }
            else   {
                for (int j = 0; j < 7; j++) {

                    strOutput[j] = strOutput[j].concat(strBuf[j]);
                }
            }

        }
        return strOutput;
    }

    private static String[] digitsArr(int digit) {
        switch (digit) {
            case '0':
                String[] digit_0 = {"  ***  ",
                        " *   * ",
                        "*     *",
                        "*     *",
                        "*     *",
                        " *   * ",
                        "  ***  "};
                return digit_0;

            case '1':
                String[] digit_1 =
                        {"   *  ",
                                "  **   ",
                                "   *   ",
                                "   *   ",
                                "   *   ",
                                "   *   ",
                                "  ***  "};
                return digit_1;

            case '2':
                String[] digit_2 =
                        {"   *** ",
                                " *   * ",
                                " *  *  ",
                                "   *   ",
                                "  *    ",
                                " *     ",
                                " ***** "};
                return digit_2;

            case '3':
                String[] digit_3 =
                               {"  ***  ",
                                " *   * ",
                                "     * ",
                                "  ***  ",
                                "     * ",
                                " *   * ",
                                "  ***  "};


                return digit_3;


            case '4':
                String[] digit_4 =
                        {"      *",
                                "   **  ",
                                "  * *  ",
                                " *  *  ",
                                "****** ",
                                "    *  ",
                                "    *  "};
                return digit_4;

            case '5':


                String[] digit_5 =
                        {"   ****",
                                " *     ",
                                " *     ",
                                " ****  ",
                                "     * ",
                                " *   * ",
                                "  ***  "};
                return digit_5;

            case '6':
                String[] digit_6 =
                        {"    ***",
                                " *   * ",
                                " *     ",
                                " ****  ",
                                " *   * ",
                                " *   * ",
                                "  ***  "};
                return digit_6;

            case '7':
                String[] digit_7 =
                        {"  *****",
                                "     * ",
                                "    *  ",
                                "   *   ",
                                "  *    ",
                                " *     ",
                                " *     "};
                return digit_7;

            case '8':
                String[] digit_8 =
                        {"    ***",
                                " *   * ",
                                " *   * ",
                                "  ***  ",
                                " *   * ",
                                " *   * ",
                                "  ***  "};
                return digit_8;

            case '9':
                String[] digit_9 = {"    ***",
                        " *   * ",
                        " *   * ",
                        "  **** ",
                        "     * ",
                        " *   * ",
                        "  ***  "};
                return digit_9;

            default:
                String[] digit_N =
                        {"  *** ",
                                " *   * ",
                                "     * ",
                                "   *   ",
                                "   *   ",
                                "       ",
                                "   **  "};
                return digit_N;


        }
    }
}


