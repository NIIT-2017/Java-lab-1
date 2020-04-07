import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Folding {
    public static String toFoldString (String str) {
        String[] arr = str.split(",");
        ArrayList<String> number = new ArrayList<String>(Arrays.asList(arr));
        ArrayList<String> foldedNumber = new ArrayList<String>();
        int start = parseInt(number.get(0));
        int previous = parseInt(number.get(0));
        for (int i = 1; i < number.size(); i++) {
            int current = parseInt(number.get(i));
            if (current == previous + 1) {
                previous = current;
            } else {
                if (start == previous) {
                    foldedNumber.add(number.get(i));

                } else if (start == previous - 1) {
                    foldedNumber.add(Integer.toString(start));
                    foldedNumber.add(Integer.toString(previous));
                } else {
                    String result = Integer.toString(start) + "-" + Integer.toString(previous);
                    foldedNumber.add(result);
                }
                start = current;
                previous = current;
            }
        }
        if (start == previous) {
            foldedNumber.add(Integer.toString(start));
        } else if (start == previous - 1) {
            foldedNumber.add(Integer.toString(start));
            foldedNumber.add(Integer.toString(previous));
        } else {
            String result = Integer.toString(start) + "-" + Integer.toString(previous);
            foldedNumber.add(result);
        }
        String result = String.join(",", foldedNumber);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your numbers which is separeted by comma whithout spaces for example 1,2,4,5,6,7,18,19,20,21: ");
        String str = in.nextLine();
        System.out.println(toFoldString(str));
        in.close();
    }
}
