public  class DrawNumbers {

    String[] number1 = new String[7];


    public static void main (String[] args){

        String[] number1 = new String[7];
        number1[0] = " * ";
        number1[1] = "** ";
        number1[2] = " * ";
        number1[3] = " * ";
        number1[4] = " * ";
        number1[5] = " * ";
        number1[6] = "***";


    String[] number2 = new String[7];
    number2[0] = " *** ";
    number2[1] = "*   *";
    number2[2] = "*  * ";
    number2[3] = "  *  ";
    number2[4] = " *   ";
    number2[5] = "*    ";
    number2[6] = "*****";

        String[] number3 = new String[7];
        number3[0] = " *** ";
        number3[1] = "*   *";
        number3[2] = "*  * ";
        number3[3] = "  *  ";
        number3[4] = "   * ";
        number3[5] = "*   *";
        number3[6] = " *** ";

        String[] number4 = new String[7];
        number4[0] = "   * ";
        number4[1] = "  ** ";
        number4[2] = " * * ";
        number4[3] = "*  * ";
        number4[4] = "*****";
        number4[5] = "   * ";
        number4[6] = "   * ";

        String[] number5 = new String[7];
        number5[0] = "*****";
        number5[1] = "*    ";
        number5[2] = "*    ";
        number5[3] = "**** ";
        number5[4] = "    *";
        number5[5] = "    *";
        number5[6] = "**** ";

        String[] number6 = new String[7];
        number6[0] = " *** ";
        number6[1] = "*   *";
        number6[2] = "*    ";
        number6[3] = "**** ";
        number6[4] = "*   *";
        number6[5] = "*   *";
        number6[6] = " *** ";

        String[] number7 = new String[7];
        number7[0] = "*****";
        number7[1] = "    *";
        number7[2] = "   * ";
        number7[3] = "  *  ";
        number7[4] = " *   ";
        number7[5] = "*    ";
        number7[6] = "*    ";

        String[] number8 = new String[7];
        number8[0] = " *** ";
        number8[1] = "*   *";
        number8[2] = "*   *";
        number8[3] = " *** ";
        number8[4] = "*   *";
        number8[5] = "*   *";
        number8[6] = " *** ";

        String[] number9 = new String[7];
        number9[0] = " *** ";
        number9[1] = "*   *";
        number9[2] = "*   *";
        number9[3] = " ****";
        number9[4] = "    *";
        number9[5] = "    *";
        number9[6] = " *** ";

        String[] number0 = new String[7];
        number0[0] = " *** ";
        number0[1] = "*   *";
        number0[2] = "*   *";
        number0[3] = "*   *";
        number0[4] = "*   *";
        number0[5] = "*   *";
        number0[6] = " *** ";

        String string = args[0];
        char[] chars = new char[string.length()];
        chars = string.toCharArray();

        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j < chars.length ; j++) {
                switch (chars[j]){
                    case '1': System.out.print(number1[i] + " ");
                    break;
                    case '2': System.out.print(number2[i] + " ");
                        break;
                    case '3': System.out.print(number3[i] + " ");
                        break;
                    case '4': System.out.print(number4[i] + " ");
                        break;
                    case '5': System.out.print(number5[i] + " ");
                        break;
                    case '6': System.out.print(number6[i] + " ");
                        break;
                    case '7': System.out.print(number7[i] + " ");
                        break;
                    case '8': System.out.print(number8[i] + " ");
                        break;
                    case '9': System.out.print(number9[i] + " ");
                        break;
                    case '0': System.out.print(number0[i] + " ");
                        break;

                }
            }
            System.out.println();
        }


        }
}
