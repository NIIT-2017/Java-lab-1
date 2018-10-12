package niit.lab1.task3;

import java.util.ArrayList;

public class Pages {
//    ''1,2,4-7,18-21'' -> 1,2,4,5,6,7,18,19,20,21.
    public static void main(String[] args) {
        parsePages("1,2,4-7,18-21");
    }

    private static void parsePages(String input) {
        ArrayList list = new ArrayList();
        
        String[] parts = input.split(",");       
        for (String part : parts) {
            if(part.contains("-")){
                String[] partArr = part.split("-");
                if(Integer.valueOf(partArr[0]) < Integer.valueOf(partArr[1])){
                    int partLength = Integer.valueOf(partArr[1]) - Integer.valueOf(partArr[0]) ;
                    for (int i = 0; i < partLength; i++) {                        
                        list.add(Integer.valueOf(partArr[0])+i);
                    }
                    list.add(partArr[1]);
                }
            }
            else
                list.add(part);
        }
        System.out.println(list);
    }
    
}
