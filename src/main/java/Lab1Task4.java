import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class NumbersToRanges {
    public static ArrayList<Integer> stringToNumbers(String line) {
        ArrayList<Integer> numbers = new ArrayList();
        String[] sublines = line.split(",");
        for (String subline : sublines) {
            numbers.add(Integer.parseInt(subline));
        }
        Collections.sort(numbers);
        return numbers;
    }
    public static ArrayList<String> numbersToRanges(ArrayList<Integer> numbers) {
        ArrayList<String> ranges = new ArrayList();
        boolean inRange = false;
        int left = 0, right;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.size() == 1) {
                ranges.add(numbers.get(i) + "");
            } else {
                if (i != numbers.size() - 1) {
                    if (numbers.get(i + 1) - numbers.get(i) > 1 && inRange == false) {
                        ranges.add(numbers.get(i) + "");
                    } else if (numbers.get(i + 1) - numbers.get(i) == 1 && inRange == false) {
                        inRange = true;
                        left = numbers.get(i);
                    } else if (numbers.get(i + 1) - numbers.get(i) > 1 && inRange == true) {
                        inRange = false;
                        right = numbers.get(i);
                        ranges.add(left + "-" + right);
                    }
                }
                else {
                    if (inRange == true) {
                        right = numbers.get(i);
                        ranges.add(left + "-" + right);
                    }
                    else
                        ranges.add(numbers.get(i) + "");
                }
            }
        }
        return ranges;
    }
}
public class Lab1Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print numbers");
        String line = in.nextLine();
        if (line.length()==0) {
            System.out.println("Numbers haven't printed");
            System.exit(1);
        }
        else {
            ArrayList<String> ranges = new ArrayList<>();
            ranges=NumbersToRanges.numbersToRanges(NumbersToRanges.stringToNumbers(line));
            for (String s: ranges) {
                if (ranges.indexOf(s) == ranges.size()-1)
                    System.out.print(s);
                else
                    System.out.print(s+", ");
            }
        }
    }
}
