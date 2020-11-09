public class NumbersToStrings {
        public static void main(String[] args) {
            String in = args[0];
            String[] out = Printing(in);
            for (int i = 0; i < out.length; i++) {
                System.out.println(out[i]);
            }
        }

           static String[] Printing(String input) {
            String[] output = new String[7];
            for (int i = 0; i < input.length(); i++) {
                int number = input.charAt(i);
                String[] strBuf = printDigitArray(number);
                if (i<1){
                    output = strBuf;
                }
                else   {
                    for (int j = 0; j < 7; j++) {

                        output[j] = output[j].concat(strBuf[j]);
                    }
                }

            }
            return output;
        }

        private static String[] printDigitArray(int number) {
            switch (number) {
                case '0':
                    String[] num_0 = {
                            "  ***  ",
                            " *   * ",
                            "*     *",
                            "*     *",
                            "*     *",
                            " *   * ",
                            "  ***  "};
                    return num_0;

                case '1':
                    String[] num_01 =
                                   {"   *  ",
                                    "  **   ",
                                    "   *   ",
                                    "   *   ",
                                    "   *   ",
                                    "   *   ",
                                    "  ***  "};
                    return num_01;

                case '2':
                    String[] num_02 =
                                     {"*** ",
                                    " *   * ",
                                    " *  *  ",
                                    "   *   ",
                                    "  *    ",
                                    " *     ",
                                    " ***** "};
                    return num_02;

                case '3':
                    String[] num_03 =
                                     {"***  ",
                                    " *   * ",
                                    "     * ",
                                    "  ***  ",
                                    "     * ",
                                    " *   * ",
                                    "  ***  "};


                    return num_03;


                case '4':
                    String[] num_04 =
                                       {"*",
                                    "   **  ",
                                    "  * *  ",
                                    " *  *  ",
                                    "****** ",
                                    "    *  ",
                                    "    *  "};
                    return num_04;

                case '5':


                    String[] num_05 =
                                     {"****",
                                    " *     ",
                                    " *     ",
                                    " ****  ",
                                    "     * ",
                                    " *   * ",
                                    "  ***  "};
                    return num_05;

                case '6':
                    String[] num_06 =
                                     {"***",
                                    " *   * ",
                                    " *     ",
                                    " ****  ",
                                    " *   * ",
                                    " *   * ",
                                    "  ***  "};
                    return num_06;

                case '7':
                    String[] num_07 =
                                    {"*****",
                                    "     * ",
                                    "    *  ",
                                    "   *   ",
                                    "  *    ",
                                    " *     ",
                                    " *     "};
                    return num_07;

                case '8':
                    String[] num_08 =
                                     {"***",
                                    " *   * ",
                                    " *   * ",
                                    "  ***  ",
                                    " *   * ",
                                    " *   * ",
                                    "  ***  "};
                    return num_08;

                case '9':
                    String[] num_09 = {
                            "  ***",
                            " *   * ",
                            " *   * ",
                            "  **** ",
                            "     * ",
                            " *   * ",
                            "  ***  "};
                    return num_09;
            }
            return null;
        }
    }

