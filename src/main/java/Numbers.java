public class Numbers {

    public static void main(String[] args) {
	// write your code here
        if (args.length==0) System.out.println("Введите чило.");
        else {
            Devout stringsOut = new Devout();
            stringsOut.appendNum(args[0]);
            stringsOut.printString();
        }
    }
}

class Devout {
    StringBuffer[] bufferOut = new StringBuffer[7];

        public Devout() {
        for (int i =0;i<7;i++)
        this.bufferOut[i] = new StringBuffer(70);
    }
    void appendNum(String numbers){
        for (int n = 0; n < numbers.length(); n++) {
            int num = numbers.charAt(n)-48;//перевод из char
            if (num>=0 && num<=9) {
                for (int i = 0; i < 7; i++) {
                    bufferOut[i].append(nums[num].substring(i * 7, i * 7 + 7));
                }
            }
            else {
                System.out.println("Не верный формат числа.");
                break;
            }
        }
    }
    void printString(){
        for (int i = 0; i < 7; i++) {
            System.out.println(bufferOut[i].toString());
        }
    }

    String [] nums = {
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
            "**   * " +
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
            "      *"};
    }
