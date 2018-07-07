import java.util.Scanner;
import static dev.gord.out.Output.*;

class RangeFolding {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        println("Enter sequence: ");

        String str = sc.nextLine();
        printf("Your result is: %s", foldingSequence(str));

        println("");
    }

    public static String foldingSequence(String s) {
        // split string
        String[] arr = s.split(",");
        StringBuilder sb = new StringBuilder();
        //initialize first item (begin of count mono sequence)
        int counter = Integer.parseInt(arr[0]);
        // initialize array for saving temp values
        int[] temp = new int[2];
        // flag for which initializes split of sequence
        boolean skipSequence;

        int counterOfIterations = 0;

        for(int i = 0; i < arr.length; i++) {
            // if item in array equals temporary counter, we can continue counting
            if(Integer.parseInt(arr[i]) == counter) {
                ++counterOfIterations;
                skipSequence = false;
                // in other hand, we reset sequence and initialize new counter with new value
            } else {
                counterOfIterations = 1;
                skipSequence = true;
                if(temp[0] == temp[1]) {
                    sb.append(temp[0]);
                    sb.append(",");
                } else if(temp[1] == 0) {
                    sb.append(temp[0]);
                    sb.append(",");
                } else {
                    sb.append(temp[0]);
                    sb.append("-");
                    sb.append(temp[1]);
                    sb.append(",");
                }
                counter = Integer.parseInt(arr[i]);
            }

            System.out.println(counterOfIterations);

            // at first, we initialize temp var
            if(i == 0)
                temp[0] = counter;
            else
                temp[1] = Integer.parseInt(arr[i]);

            if(skipSequence) {
                temp[0] = counter;
            }
            counter++;

        }

        if(temp[0] == temp[1]) {
            sb.append(temp[0]);
        } else {
            sb.append(temp[0]);
            sb.append("-");
            sb.append(temp[1]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        start();
    }
}