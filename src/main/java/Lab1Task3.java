import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class RangeToNumbers {
    private ArrayList<Integer> numbers;
    RangeToNumbers(String line) {
        this.numbers=new ArrayList<>();
        String[] ranges = line.split(",");
        for (String range : ranges) {
            String[] limits = range.split("-");
            int left = Integer.parseInt(limits[0]);
            int right = Integer.parseInt(limits[limits.length - 1]);
            for (int i = left; i <= right; i++) {
                this.numbers.add(i);
            }
        }
        Collections.sort(numbers);
    }
    ArrayList<Integer> getNumbers(){return numbers;}
}
public class Lab1Task3 {
    String stringRangesToStringNumbers(String line_in){
        RangeToNumbers rtn = new RangeToNumbers(line_in);
        String line_out="";
        for (int i:rtn.getNumbers()) {
            if (rtn.getNumbers().indexOf(i) == rtn.getNumbers().size() - 1)
                line_out=line_out.concat(i+"");
            else
                line_out=line_out.concat(i+", ");
        }
        return line_out;
    }
    public static void main(String[] args) {
        System.out.println("Print ranges");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if (line.length()==0) {
            System.out.println("Ranges haven't printed");
            System.exit(1);
        }
        else {
            Lab1Task3 task3 = new Lab1Task3();
            System.out.println(task3.stringRangesToStringNumbers(line));
        }
    }
}
