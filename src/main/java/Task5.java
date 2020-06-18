import java.util.Scanner;

//import java.util.Scanner;
public class Task5 {
    static String[] zero = {"  ***    ", " *   *   ", "*     *  ", "*     *  ", "*     *  ", " *   *   ", "  ***    "};
    static String[] one = {" *   ", "**   ", " *   ", " *   ", " *   ", " *   ", "***  "};
    static String[] two = {" ***   ", "*   *  ", "*  *   ", "  *    ", " *     ", "*      ", "*****  "};
    static String[] tree = {" ***   ", "*   *  ", "    *  ", " ***   ", "    *  ", "*   *  ", " ***   "};
    static String[] four = {"   *    ", "  **    ", " * *    ", "*  *    ", "******  ", "   *    ", "   *    "};
    static String[] five = {"*****  ", "*      ", "*      ", " ***   ", "    *  ", "    *  ", " ***   "};
    static String[] six = {" ***   ", "*      ", "*      ", "****   ", "*   *  ", "*   *  ", " ***   "};
    static String[] seven = {"*****  ", "    *  ", "   *   ", "  *    ", " *     ", "*      ", "*      "};
    static String[] eight = {" ***   ", "*   *  ", "*   *  ", " ***   ", "*   *  ", "*   *  ", " ***   "};
    static String[] nine = {" ****  ", "*   *  ", "*   *  ", " ****  ", "    *  ", "    *  ", "    *  "};

    public static String BuildNum(String num, int i) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < num.length(); j++) {
            if (num.charAt(j) == '0')
                sb.append(zero[i]);
            if (num.charAt(j) == '1')
                sb.append(one[i]);
            if (num.charAt(j) == '2')
                sb.append(two[i]);
            if (num.charAt(j) == '3')
                sb.append(tree[i]);
            if (num.charAt(j) == '4')
                sb.append(four[i]);
            if (num.charAt(j) == '5')
                sb.append(five[i]);
            if (num.charAt(j) == '6')
                sb.append(six[i]);
            if (num.charAt(j) == '7')
                sb.append(seven[i]);
            if (num.charAt(j) == '8')
                sb.append(eight[i]);
            if (num.charAt(j) == '9')
                sb.append(nine[i]);
        }
        String equils = sb.toString();
        return equils;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter interval numbers: ");
        String number = in.nextLine();
        for (int i = 0; i < nine.length; i++) {
            System.out.println(BuildNum(number, i));
        }
    }
}