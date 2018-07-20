public class Zadanie_5 {
    public static void main(String[] args) {
        String[] ts0 = {"  ***  "," *   * ", "*     *","*     *","*     *"," *   * ", "  ***  "};
        String[] ts1 = {"  * ", " ** ","* * ","  * ","  * ","  * "," ***"};
        String[] ts2 = {" *** ","*   *","*  * ","  *  "," *   ","*    ","*****"};
        String[] ts3 = {" *** ","*   *","    *","  ***","    *","*   *"," *** "};
        String[] ts4 = {"   *  ","  **  "," * *  ","*  *  ","***** ","   *  ","   *  "};
        String[] ts5 = {"*****","*    ","*    ","**** ","    *","    *","**** "};
        String[] ts6 = {" *** ","*    ","*    ","**** ","*   *","*   *"," *** "};
        String[] ts7 = {"*****","    *","   * ","  *  "," *   ","*    ","*    "};
        String[] ts8 ={" *** ","*   *","*   *"," *** ","*   *","*   *"," *** "};
        String[] ts9 = {" *** ","*   *","*   *"," ****","    *","    *"," *** "};
        String str = new String(args[0] + " ");
        char[] x = str.toCharArray();
        for (int i = 0; i < 7; i++) {
            for (char a : x) {
            switch (a) {
                case '0':
                    System.out.print(ts0[i] + " ");
                    break;
                case '1':
                    System.out.print(ts1[i] + " ");
                    break;
                case '2':
                    System.out.print(ts2[i] + " ");
                    break;
                case '3':
                    System.out.print(ts3[i] + " ");
                    break;
                case '4':
                    System.out.print(ts4[i] + " ");
                    break;
                case '5':
                    System.out.print(ts5[i] + " ");
                    break;
                case '6':
                    System.out.print(ts6[i] + " ");
                    break;
                case '7':
                    System.out.print(ts7[i] + " ");
                    break;
                case '8':
                    System.out.print(ts8[i] + " ");
                    break;
                case '9':
                    System.out.print(ts9[i] + " ");
                    break;
                case ' ':
                    System.out.println();
            }
            }

        }

    }
}
