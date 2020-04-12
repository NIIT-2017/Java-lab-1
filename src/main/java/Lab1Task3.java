import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class RangeToNumbers {
    public static ArrayList<Integer> rangeToNumbers(String line) {
        ArrayList<Integer> numbers = new ArrayList();
        String[] ranges = line.split(",");
        for (String range : ranges) {
            String[] limits = range.split("-");
            int left = Integer.parseInt(limits[0]);
            int right = Integer.parseInt(limits[limits.length - 1]);
            for (int i = left; i <= right; i++) {
                numbers.add(i);
            }
        }
        Collections.sort(numbers);
        return numbers;
    }
}
public class Lab1Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        System.out.println("Print ranges");
        String line = in.nextLine();
        if (line.length()==0) {
            System.out.println("Ranges haven't printed");
            System.exit(1);
        }
        else {
            numbers = RangeToNumbers.rangeToNumbers(line);
            for (int i : numbers) {
                if (numbers.indexOf(i) == numbers.size() - 1)
                    System.out.print(i);
                else
                    System.out.print(i + ",");
            }
        }
    }
}
