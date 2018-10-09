package range_scan;

import java.util.ArrayList;

public class RangeScan {

    public static String createSequence(String[] args){
        String[] arr = args[0].split(",");
        String s = "";
        for (int i =0; i<arr.length; i++) {
            if (arr[i].indexOf('-') != -1) {
                String[] arr1 = arr[i].split("-");
                int lowVal = Integer.parseInt(arr1[0]);
                int highVal = Integer.parseInt(arr1[1]);
                ArrayList arr2 = new ArrayList();
                String s1 = "";
                for (int j = 0; j < highVal - lowVal + 1; j++) {
                    arr2.add(lowVal + j);
                    s1 = s1 + arr2.get(j)+",";
                }
                s1 = s1.substring(0, s1.length()-1);
                arr[i]=s1;
            }
            s = s+arr[i]+",";
        }
        s = s.substring(0, s.length()-1);
        return s;
    }

    public static void main(String[] args){
        System.out.print(createSequence(args));
    }

}
