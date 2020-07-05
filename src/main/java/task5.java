import java.util.Scanner;

public class task5 {

    public static String[][] Numbers = {
            {"  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  "},
            {" * ", "** ", " * ", " * ", " * ", " * ", "***"},
            {" *** ", "*   *", "*  * ", "  *  ", " *   ", "*    ", "*****"},
            {" *** ", "    *", "    *", " *** ", "    *", "    *", " *** "},
            {"   *  ", "  **  ", " * *  ", "*  *  ", "******", "   *  ", "   *  "},
            {"**** ", "*    ", "*    ", "**** ", "    *", "    *", "**** "},
            {"  *  ", " *   ", "*    ", "**** ", "*   *", "*   *", " *** "},
            {"*****", "    *", "   * ", "  *  ", " *   ", "*    ", "*    "},
            {" *** ", "*   *", "*   *", " *** ", "*   *", "*   *", " *** "},
            {" *** ", "*   *", "*   *", " ****", "   * ", "  *  ", " *   "}
    };

    public static String ToChange(String number, int index) {
        StringBuilder buf = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            int add  = number.charAt(i)-'0';
            buf.append(Numbers[add][index]);
        }
        return buf.toString();
    }

    public static void main (String[] args){
        Scanner line = new Scanner(System.in);
        System.out.print("Input number: ");
        String numbers = line.nextLine();
        for (int j = 0; j< Numbers[0].length; j++) {
            System.out.println(ToChange(numbers, j));
        }
    }
}