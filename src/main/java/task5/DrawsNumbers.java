package task5;
import java.util.Scanner;

public class DrawsNumbers {

    private static void draws(String line) {
        String[] one = {" @  ", "@@  ", " @  ", " @  ", " @  ", " @  ", "@@@  "};
        String[] two = {" @@@  ", "@   @ ", "@   @ ", "   @  ", "  @   ", " @    ", "@@@@@ "};
        String[] three = {" @@  ", "@  @ ", "   @ ", "  @  ", "   @ ", "@  @ ", " @@  "};
        String[] four = {"   @  ", "  @@  ", " @ @  ", "@  @  ", "@@@@@ ", "   @  ", "   @  "};
        String[] five = {"@@@@ ", "@    ", "@    ", "@@@  ", "   @ ", "   @ ", "@@@  "};
        String[] six = {" @@@ ", "@    ", "@    ", "@@@  ", "@  @ ", "@  @ ", " @@  "};
        String[] seven = {"@@@@ ", "   @ ", "   @ ", "  @  ", " @   ", "@    ", "@    "};
        String[] eight = {" @@  ", "@  @ ", "@  @ ", " @@  ", "@  @ ", "@  @ ", " @@  "};
        String[] nine = {" @@@ ", "@  @ ", "@  @ ", " @@@ ", "   @ ", "   @ ", "@@@  "};
        String[] zero = {" @@  ", "@  @ ", "@  @ ", "@  @ ", "@  @ ", "@  @ ", " @@ "};

        char[] str = line.toCharArray();
        for (int i = 0; i < 7; i++) {
            for (int j : str) {
                switch (j) {
                    case '0':
                        System.out.print(zero[i]);
                        break;
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
                    default:
                        System.out.print("This not numbers!!!");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter your numbers :");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        draws(line);
    }
}
