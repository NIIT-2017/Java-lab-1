import java.util.ArrayList;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class RangeExt {
    public static void main(String[] args) {

        String str = args[0];
        ArrayList<Integer> nums = RangeNums(str);
        RangeExtensionPrint(nums);
    }

    static ArrayList<Integer> RangeNums(String str) {

        ArrayList<Integer> nums = new ArrayList<Integer>();

        String[] strings = str.split(",");
        int i = 0;//элемент строки strings
        int j = 0;// элемент подстроки strings1, имеющая в составе "-"
        while (i < strings.length) {
            if (strings[i].contains("-")) { //Выполняется, если в подстроке есть "-"
                try {
                String[] strings1 = strings[i].split("-");
                int s = parseInt(strings1[j]);
                int d = parseInt(strings1[j + 1]);
                // ArrayList<Integer> nums1 = new ArrayList<Integer>();
                for (; s <= d; s++) {
                    nums.add(s);
                }
                } catch (NumberFormatException exc31) {
                    }

            } else {
                try {
                    nums.add(valueOf(strings[i]));
                } catch (NumberFormatException exc37) {
                }
            }
            i++;
          //  j++;

        }
        return nums;
    }

    static void RangeExtensionPrint(ArrayList nums) {

        for (int i = 0; i < nums.size(); i++) {
            if (i < nums.size() - 1) {
                System.out.print(nums.get(i) + ",");
            } else {
                System.out.print(nums.get(i) + ".");
            }
        }
    }
}