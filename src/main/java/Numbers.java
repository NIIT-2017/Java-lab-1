import java.util.ArrayList;

public class Numbers {
    public static void main(String[] args) {
        for (String s : args)
            if (Graphic.printNumbers(s) == 1)
                break;
    }
}

class Graphic{
    private static String[][] numbers = {{"  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  "},
                          {" * ", "** ", " * ", " * ", " * ", " * ", "***"},
                          {" *** ", "*   *", "*   *", "  *  ", " *   ", "*    ", "*****"},
                          {" *** ", "*   *", "    *", " *** ", "    *", "*   *", " *** "},
                          {"   *  ", "  **  ", " * *  ", "*  *  ", "******", "   *  ", "   *  "},
                          {"*****", "*    ", "*    ", "**** ", "    *", "*   *", " *** "},
                          {"*    ", "*    ", "*    ", "**** ", "*   *", "*   *", "**** "},
                          {"*****", "    *", "    *", "  *  ", " *   ", "*    ", "*    "},
                          {" *** ", "*   *", "*   *", " *** ", "*   *", "*   *", " *** "},
                          {"**** ", "*   *", "*   *", "**** ", "*    ", "*    ", "*    "}};

    private static ArrayList<Integer> list = new ArrayList<>();

    private static boolean doList(String str){
        for (char ch: str.toCharArray()) {
            if (!Character.isDigit(ch)){
                System.out.format("There is an invalid symbol in the input data: '%c'%n", ch);
                return false;
            }
            list.add(ch - '0');
        }
        return true;
    }

    public static int printNumbers(String str){
        if (doList(str)) {
            for (int i = 0; i < numbers[0].length; i++) {
                for (int j: list)
                    System.out.print(numbers[j][i] + " ");
                System.out.println();
            }
            System.out.format("%n%n");
            list.clear();
            return 0;
        }
        else {
            list.clear();
            return 1;
        }
    }
}
