import java.util.Scanner;
import java.util.StringTokenizer;

public class task5 {
    public static void main(String[] args) {
        System.out.print("let's draw numbers, please enter the numbers you need to draw: ");
        Scanner in = new Scanner(System.in);
        String text = in.next();
        drawDigit(text);

    }

    public static void drawDigit (String text){
        String[] one = {" #  ", "##  ", " #  "," #  "," #  "," #  ","### "};
        String[] two = {" ###  ", "#   # ", "#   # ","   #  ", "  #   ", " #    ", "##### "};
        String[] three = {" ##  ", "#  # ", "   # ", "  #  ", "   # ", "#  # ", " ##  "};
        String[] four = {"   #  ", "  ##  ", " # #  ", "#  #  ", "##### ", "   #  ", "   #  "};
        String[] five = {"#### ", "#    ", "#    ", "###  ", "   # ","   # ", "###  "};
        String[] six = {" ### ", "#    ","#    ","###  ","#  # ","#  # "," ##  "};
        String[] seven = {"#### ", "   # ","   # ","  #  "," #   ", "#    ","#    "};
        String[] eight = {" ##  ","#  # ","#  # "," ##  ","#  # ","#  # ", " ##  "};
        String[] nine = {" ### ", "#  # ","#  # "," ### ","   # ","   # ","###  "};
        String[] zero = {" ##  ", "#  # ", "#  # ", "#  # ", "#  # ", "#  # "," ##  "};

        char[] textArray = text.toCharArray();
        for (int i = 0; i < 7; i++){
            for (char c : textArray) {
                switch (c) {
                    case '1':
                        System.out.print(one[i]);
                        break;
                    case '2':
                        System.out.print(two[i]);
                        break;
                    case '3':
                        System.out.print(three[i]);
                        break;
                    case '4':
                        System.out.print(four[i]);
                        break;
                    case '5':
                        System.out.print(five[i]);
                        break;
                    case '6':
                        System.out.print(six[i]);
                        break;
                    case '7':
                        System.out.print(seven[i]);
                        break;
                    case '8':
                        System.out.print(eight[i]);
                        break;
                    case '9':
                        System.out.print(nine[i]);
                        break;
                    case '0':
                        System.out.print(zero[i]);
                        break;
                    default:
                        System.out.print("?");
                }
            }
            System.out.print("\n");
        }
    }
}

