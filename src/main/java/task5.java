import java.util.ArrayList;

public class task5 {
    private static StringBuilder line = new StringBuilder();

    private static String[] zero = {"  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  "};
    private static String[] one = {" * ", "** ", " * ", " * ", " * ", " * ", "***"};
    private static String[] two = {" *** ", "*   *", "*  * ", "  *  ", " *   ", "*    ", "*****"};
    private static String[] three = {" *** ", "*   *", "    *", " *** ", "    *", "*   *", " *** "};
    private static String[] four = {"   * ", "  ** ", " * * ", "*  * ", "*****", "   * ", "   * "};
    private static String[] five = {"*****", "*    ", "*    ", "**** ", "    *", "*   *", " *** "};
    private static String[] six = {" *** ", "*   *", "*    ", "**** ", "*   *", "*   *", " *** "};
    private static String[] seven = {"*****", "    *", "   * ", "  *  ", " *   ", "*    ", "*    "};
    private static String[] eight = {" *** ", "*   *", "*   *", " *** ", "*   *", "*   *", " *** "};
    private static String[] nine = {" *** ", "*   *", "*   *", " ****", "    *", "*   *", " *** "};

    public static String addLines(String n, int i) {
        for (int j = 0; j < n.length(); j++) {
            if (n.charAt(j) == '0') line.append(zero[i]).append("   ");
            else if (n.charAt(j) == '1') line.append(one[i]).append("   ");
            else if (n.charAt(j) == '2') line.append(two[i]).append("   ");
            else if (n.charAt(j) == '3') line.append(three[i]).append("   ");
            else if (n.charAt(j) == '4') line.append(four[i]).append("   ");
            else if (n.charAt(j) == '5') line.append(five[i]).append("   ");
            else if (n.charAt(j) == '6') line.append(six[i]).append("   ");
            else if (n.charAt(j) == '7') line.append(seven[i]).append("   ");
            else if (n.charAt(j) == '8') line.append(eight[i]).append("   ");
            else if (n.charAt(j) == '9') line.append(nine[i]).append("   ");
        }
        line.setLength(line.length() - 3); // удаление 3-х лишних пробелов в конце
        return line.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.print("Введите число");
            System.exit(-1);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(addLines(args[0], i));
            line.setLength(0);
        }
    }
}
