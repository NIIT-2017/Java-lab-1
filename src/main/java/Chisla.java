/*public class Chisla {
    public static void main(String[] args){
        String inputStr = args[0];

        System.out.println("число: "+inputStr);
        System.out.print();
    }
}*/
public class Chisla {
    public static void main(String[] args) {
        Big chislo = new Big();
        chislo.appendNum(args[0]); // перевод
        chislo.printBig(); // печать
    }
}

class Big {
    StringBuffer[] bufferOut = new StringBuffer[7]; // высота большого числа

    String [] bignum =
            {
                    "  ***  " +
                    " *   * " +
                    "*     *" +
                    "*     *" +
                    "*     *" +
                    " *   * " +
                    "  ***  ",

                    "   *   " +
                    "  **   " +
                    "   *   " +
                    "   *   " +
                    "   *   " +
                    "   *   " +
                    "  ***  ",

                    "  ***  " +
                    " *   * " +
                    " *  *  " +
                    "   *   " +
                    "  *    " +
                    " *     " +
                    " ****  ",

                    "  ***  " +
                    " *   * " +
                    "     * " +
                    "  ***  " +
                    "     * " +
                    " *   * " +
                    "  ***  ",

                    "   *   " +
                    "  **   " +
                    " * *   " +
                    "*  *   " +
                    "****** " +
                    "   *   " +
                    "   *   ",

                    "*****  " +
                    "*      " +
                    "*      " +
                    "*****  " +
                    "     * " +
                    "*    * " +
                    " ****  ",

                    "  ***  " +
                    " *     " +
                    "* ***  " +
                    "*    * " +
                    "*     *" +
                    " *   * " +
                    "  ***  ",

                    " ***** " +
                    "     * " +
                    "    *  " +
                    "   *   " +
                    "  *    " +
                    " *     " +
                    " *     ",

                    "  ***  " +
                    " *   * " +
                    "  ***  " +
                    " ***** " +
                    "*     *" +
                    "*     *" +
                    " ***** ",

                    "   ****" +
                    "  *   *" +
                    "  *   *" +
                    "   ****" +
                    "      *" +
                    "      *" +
                    "      *"
            };

    public Big() {
        for (int i = 0; i < 7; i++) {this.bufferOut[i] = new StringBuffer(20);}
    }
    void appendNum(String bigNumber){
        for (int k = 0; k < bigNumber.length(); k++) {
            int num = bigNumber.charAt(k)-48;//перевод из char
            if (num>=0 && num<=9) {
                for (int i = 0; i < 7; i++) {bufferOut[i].append(bignum[num].substring(i * 7, i * 7 + 7));}
            }
        }
    }
    void printBig(){
        for (int i = 0; i < 7; i++) {
            System.out.println(bufferOut[i].toString());
        }
    }
}