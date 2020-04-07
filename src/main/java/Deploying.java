import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Deploying {

    public static String toDeployString (String str) {
        String[] arr = str.split(",");
        ArrayList<String> number = new ArrayList<String>(Arrays.asList(arr));
        ArrayList<String> deployedNumber = new ArrayList<String>();
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i).contains("-")) {
                String[] arr1 = number.get(i).split("-");
                for (int j = parseInt(arr1[0]); j <= parseInt(arr1[1]); j++) {
                    deployedNumber.add(Integer.toString(j));
                }
            } else {
                deployedNumber.add(number.get(i));
            }
        }
        String result = String.join(",",  deployedNumber);
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your numbers which is separeted by comma whithout spaces, for example 1,2,4-7,18-21: ");
        String str = in.nextLine();
        System.out.println(toDeployString(str));
        in.close();
    }
}
