
import java.util.Scanner;
import static dev.gord.out.Output.*;

public class RangeDeployment {

    public void start() {
        Scanner sc = new Scanner(System.in);
        println("Enter sequence: ");

        String str = sc.nextLine();
        printf("Your result is: %s", deploySequence(str));

        System.out.println();
    }

    public static String deploySequence(String s) {
        String res;
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(",");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("-")) {
                sb.append(deploy(arr[i]));
            } else {
                sb.append(arr[i]);
                sb.append(',');
            }
        }
        sb.deleteCharAt(sb.length()-1);
        res = sb.toString();
        return res;
    }

    private static String deploy(String s) {

        String res;
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("-");
        int startRange = Integer.parseInt(arr[0]);
        int endRange = Integer.parseInt(arr[1]);

        for (int i = startRange; i <= endRange; i++) {
            sb.append(String.valueOf(i));
            sb.append(',');
        }
        res = sb.toString();
        return res;
    }

    public static void main(String[] args) {
        new RangeDeployment().start();
    }
}
