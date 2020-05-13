import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class NumbersToRanges {
    ArrayList<Integer> stringToNumbers(String line) {
        ArrayList<Integer> numbers = new ArrayList();
        String[] sublines = line.split(",");
        for (String subline : sublines) {
            numbers.add(Integer.parseInt(subline));
        }
        Collections.sort(numbers);
        return numbers;
    }
    ArrayList<String> numbersToRanges(ArrayList<Integer> numbers) {
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
    String stringNumbersToStringRanges(String line_in){
        NumbersToRanges ntr = new NumbersToRanges();
        String line_out="";
        for (String s: ntr.numbersToRanges(ntr.stringToNumbers(line_in))){
            if (ntr.numbersToRanges(ntr.stringToNumbers(line_in)).indexOf(s)
                    == ntr.numbersToRanges(ntr.stringToNumbers(line_in)).size()-1)
                line_out=line_out.concat(s);
            else
                line_out=line_out.concat(s+",");
        }
        return line_out;
    }
    public static void main(String[] args) {
        System.out.println("Print numbers");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if (line.length()==0) {
            System.out.println("Numbers haven't printed");
            System.exit(1);
        }
        else {
            Lab1Task4 task4 = new Lab1Task4();
            System.out.println(task4.stringNumbersToStringRanges(line));
        }
    }
}
