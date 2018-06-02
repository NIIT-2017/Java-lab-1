import java.util.ArrayList;

import static java.lang.Integer.valueOf;

public class Range {
    public static void main(String[] args) {
        String[] str = args;
        ArrayList<Integer> num = RangeNum(str);
        RangePrint(num);
    }

    static ArrayList RangeNum(String[] str) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        String[] strings = str[0].split(",");
        for (int i = 0; i < strings.length; i++) {
            try {
                num.add(valueOf(strings[i]));
            } catch (NumberFormatException exc) {
            }
        }
        return num;
    }


    static void RangePrint(ArrayList<Integer> num) {
       // ArrayList<Integer> nums = num ;
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i));
            if (i + 1 < num.size() && num.get(i) == (num.get(i + 1) - 1)) {
                System.out.print("-");
            } else if (i == num.size() - 1) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }

            for (; i + 1 < num.size() && num.get(i) == (num.get(i + 1) - 1) && num.get(i) == (num.get(i + 2) - 2); i++);
        }
    }
}