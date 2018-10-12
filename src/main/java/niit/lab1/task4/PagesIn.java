package niit.lab1.task4;

import java.util.ArrayList;

public class PagesIn {
//    1,2,4,5,6,7,18,19,20,21 -> ''1,2,4-7,18-21''.
    static ArrayList<String> rangeStr;
    public static void main(String[] args) {        
        parsePages("1,2,4,5,6,7,18,19,20,21,22,25,26,27");
//        parsePages("1,2,3,4,5,6,7,14,15,18,19,20,22,23,25,26,27");
    }

    private static void parsePages(String input) {
        ArrayList<String> output = new ArrayList<>();
        rangeStr = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(); 
        String[] parts = input.split(",");
        
        for (int i = 0; i < parts.length; i++) {
            list.add(Integer.valueOf(parts[i]));
        }
        
        output = searchRanges(list,0);

        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i));
            if (i != output.size()-1) {
                System.out.print(", ");
            }else{
                System.out.print(" ");
            }                
        }
    }

    private static ArrayList<String> searchRanges(ArrayList<Integer> list, int initPos) {
        ArrayList<String> output = new ArrayList<>();
//        HashSet numRangeSet = new HashSet();
        int cnt = 0;
        int startValue = 0;
        int endValue = 0;
        for(int i = initPos+1; i < list.size(); i++){
//            System.out.println(")"+list.get(i-1)+","+ list.get(i)); 
            if(list.get(i) - list.get(i-1) == 1){
                cnt++;
//                System.out.println(cnt+"---"+ (i-1) +"==>"+list.get(i-1)+",   "+i+"==>"+list.get(i)); 
                if(cnt>1){ 
                    startValue = list.get(i-cnt);
                    endValue = list.get(i);
//                    System.out.println("==["+list.get(i-cnt)+"-"+list.get(i)+"]");
                }
                if (i==list.size()-1) {
                    System.out.println("~range["+startValue+","+endValue+"]");
                    output.add(startValue+"-"+endValue);
                }
            }else{
//                System.out.println("!!!"+cnt+" "+i+" ==> "+list.get(i));
//                System.out.println("!="+list.get(i-cnt-1)+"-"+list.get(i-1));
                if (cnt == 1) {
                    System.out.println("~single["+list.get(i-cnt-1)+"]");
                    System.out.println("~single["+list.get(i-1)+"]");
                    output.add(String.valueOf(list.get(i-cnt-1)));
                    output.add(String.valueOf(list.get(i-1)));
                }
                startValue=list.get(i-cnt-1);                
                endValue = list.get(i-1);                
                cnt = 0;
                if(cnt == 0 && endValue - startValue > 1){
                    System.out.println("~range["+startValue+","+endValue+"]");
                    output.add(startValue+"-"+endValue);
                }
            }
        }
//        System.out.println("------------------------"+output);
        return output;
    }
}
