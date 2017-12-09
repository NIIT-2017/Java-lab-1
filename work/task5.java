
public class task5 {


    public static void main(String[] args) {
        String str = args[0];
        str = str + " ";
        String[] abc = Processing(str);
        for (int i=0;i<6;i++) {
            System.out.println(abc[i]);
        }
    }

    public static String[] Processing(String str) {
        String[] abc = new String[6];
        for (int i=0 ;i<6;i++)
        {
            abc[i]="";
        }
        int length = str.length();
        int k = 0;

        while(str.charAt(k) != ' ') {
            int value = Character.getNumericValue(str.charAt(k));
            ++k;
            switch(value) {
                case 0:
                    abc[0] +=  "    ***   ";
                    abc[1] +=  "   *   *  ";
                    abc[2] +=  "  *     * ";
                    abc[3] +=  "  *     * ";
                    abc[4] +=  "   *   *  ";
                    abc[5] +=  "    ***   ";
                    break;
                case 1:
                    abc[0] = abc[0] + "    **    ";
                    abc[1] = abc[1] + "   * *    ";
                    abc[2] = abc[2] + "  *  *    ";
                    abc[3] = abc[3] + "     *    ";
                    abc[4] = abc[4] + "     *    ";
                    abc[5] = abc[5] + "    ***   ";
                    break;
                case 2:
                    abc[0] = abc[0] + "   ***    ";
                    abc[1] = abc[1] + "  *   *   ";
                    abc[2] = abc[2] + "  *   *   ";
                    abc[3] = abc[3] + "     *    ";
                    abc[4] = abc[4] + "    *     ";
                    abc[5] = abc[5] + "  *****   ";
                    break;
                case 3:
                    abc[0] = abc[0] + "   ***    ";
                    abc[1] = abc[1] + "  *   *   ";
                    abc[2] = abc[2] + "     *    ";
                    abc[3] = abc[3] + "      *   ";
                    abc[4] = abc[4] + "  *   *   ";
                    abc[5] = abc[5] + "   ***    ";
                    break;
                case 4:
                    abc[0] = abc[0] + "     **   ";
                    abc[1] = abc[1] + "    * *   ";
                    abc[2] = abc[2] + "   *  *   ";
                    abc[3] = abc[3] + "  ******  ";
                    abc[4] = abc[4] + "      *   ";
                    abc[5] = abc[5] + "      *   ";
                    break;
                case 5:
                    abc[0] = abc[0] + "   *****  ";
                    abc[1] = abc[1] + "   *      ";
                    abc[2] = abc[2] + "   * **   ";
                    abc[3] = abc[3] + "       *  ";
                    abc[4] = abc[4] + "  *    *  ";
                    abc[5] = abc[5] + "   ***    ";
                    break;
                case 6:
                    abc[0] = abc[0] + "   ****   ";
                    abc[1] = abc[1] + "  *       ";
                    abc[2] = abc[2] + "  *****   ";
                    abc[3] = abc[3] + "  *    *  ";
                    abc[4] = abc[4] + "  *    *  ";
                    abc[5] = abc[5] + "   ****   ";
                    break;
                case 7:
                    abc[0] = abc[0] + "  *****   ";
                    abc[1] = abc[1] + "      *   ";
                    abc[2] = abc[2] + "     *    ";
                    abc[3] = abc[3] + "    *     ";
                    abc[4] = abc[4] + "    *     ";
                    abc[5] = abc[5] + "    *     ";
                    break;
                case 8:
                    abc[0] = abc[0] + "   ***   ";
                    abc[1] = abc[1] + "  *   *    ";
                    abc[2] = abc[2] + "   ***   ";
                    abc[3] = abc[3] + "  *    *  ";
                    abc[4] = abc[4] + "  *    *  ";
                    abc[5]= abc[5] + "   ****   ";
                    break;
                case 9:
                    abc[0] = abc[0] + "   ****   ";
                    abc[1] = abc[1] + "  *   *    ";
                    abc[2] = abc[2] + "   ****  ";
                    abc[3] = abc[3] + "      *  ";
                    abc[4] = abc[4] + "  *   *  ";
                    abc[5] = abc[5] + "   ***   ";
                    break;
            }
        }

        return abc;
    }
}