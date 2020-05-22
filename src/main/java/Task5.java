import java.util.Scanner;

public class Task5 {
    public static String[] [] stars= {{"  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  "},
            {" * ", "** ", " * ", " * ", " * ", " * ", "***"},
            {" *** ", "*   *", "*  * ", "  *  ", " *   ", "*    ", "*****"},
            {" *** ", "    *", "    *", " *** ", "    *", "    *", " *** "},
            {"   *  ", "  **  ", " * *  ", "*  *  ", "******", "   *  ", "   *  "},
            {"**** ", "*    ", "*    ", "**** ", "    *", "    *", "**** "},
            {"  *  ", " *   ", "*    ", "**** ", "*   *", "*   *", " *** "},
            {"*****", "    *", "   * ", "  *  ", " *   ", "*    ", "*    "},
            {" *** ", "*   *", "*   *", " *** ", "*   *", "*   *", " *** "},
            {" *** ", "*   *", "*   *", " ****", "   * ", "  *  ", " *   "}};

       public static String numbersByStars (String number, int symbol) {
        StringBuilder bld = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            int j =number.charAt(i)-'0';
            bld.append(stars[j][symbol]);
        }
        return bld.toString();
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String numbers = in.nextLine();
        for (int j = 0; j<stars[0].length; j++) {
            System.out.println(numbersByStars(numbers, j));
        }
    }
}
