public class Numbers {
    public static void main(String[] args) {

        String str = args[0];
        char chs[] = str.toCharArray();
        String [][] star = new String [7][chs.length];
        for (int i = 0; i < chs.length;i++) {
            switch (chs[i]) {
                case '0' :
                    star [0] [i] = "  ***  ";
                    star [1] [i] = " *   * ";
                    star [2] [i] = "*     *";
                    star [3] [i] = "*     *";
                    star [4] [i] = "*     *";
                    star [5] [i] = " *   * ";
                    star [6] [i] = "  ***";
                    break;
                case '1' :
                    star [0] [i] = "    * ";
                    star [1] [i] = "   ** ";
                    star [2] [i] = "    * ";
                    star [3] [i] = "    * ";
                    star [4] [i] = "    * ";
                    star [5] [i] = "    * ";
                    star [6] [i] = "   ***";
                    break;
                case '2' :
                    star [0] [i] = "  *** ";
                    star [1] [i] = " *   *";
                    star [2] [i] = " *  * ";
                    star [3] [i] = "   *  ";
                    star [4] [i] = "  *   ";
                    star [5] [i] = " *    ";
                    star [6] [i] = "******";
                    break;
                case '3' :
                    star [0] [i] = "  *** ";
                    star [1] [i] = " *   *";
                    star [2] [i] = "     *";
                    star [3] [i] = "   ** ";
                    star [4] [i] = "     *";
                    star [5] [i] = " *   *";
                    star [6] [i] = "  *** ";
                    break;
                case '4' :
                    star [0] [i] = "    * ";
                    star [1] [i] = "   ** ";
                    star [2] [i] = "  * * ";
                    star [3] [i] = " *  * ";
                    star [4] [i] = "******";
                    star [5] [i] = "    * ";
                    star [6] [i] = "   ***";
                    break;
                case '5' :
                    star [0] [i] = "******";
                    star [1] [i] = "*     ";
                    star [2] [i] = "***** ";
                    star [3] [i] = "     *";
                    star [4] [i] = "     *";
                    star [5] [i] = "     *";
                    star [6] [i] = "***** ";
                    break;
                case '6' :
                    star [0] [i] = "    * ";
                    star [1] [i] = "   *  ";
                    star [2] [i] = "  *   ";
                    star [3] [i] = " **** ";
                    star [4] [i] = "*    *";
                    star [5] [i] = " *   *";
                    star [6] [i] = "  *** ";
                    break;
                case '7' :
                    star [0] [i] = "******";
                    star [1] [i] = "    * ";
                    star [2] [i] = "   *  ";
                    star [3] [i] = "  *   ";
                    star [4] [i] = " *    ";
                    star [5] [i] = "*     ";
                    star [6] [i] = "*     ";
                    break;
                case '8' :
                    star [0] [i] = "  *** ";
                    star [1] [i] = " *   *";
                    star [2] [i] = " *   *";
                    star [3] [i] = "  *** ";
                    star [4] [i] = " *   *";
                    star [5] [i] = " *   *";
                    star [6] [i] = "  *** ";
                    break;
                case '9' :
                    star [0] [i] = "  *** ";
                    star [1] [i] = " *   *";
                    star [2] [i] = " *   *";
                    star [3] [i] = "  *** ";
                    star [4] [i] = "   *  ";
                    star [5] [i] = "  *   ";
                    star [6] [i] = " *    ";
                    break;
                default:
                    star [0] [i] = "*    *";
                    star [1] [i] = " *  * ";
                    star [2] [i] = "   *  ";
                    star [3] [i] = "   *  ";
                    star [4] [i] = "   *  ";
                    star [5] [i] = "  * * ";
                    star [6] [i] = " *   *";
                    break;
            }
        }

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < star [j].length;i++) {
                System.out.print (star[j][i] + "\t");
            }
            System.out.print ("\n");
        }


    }
}
