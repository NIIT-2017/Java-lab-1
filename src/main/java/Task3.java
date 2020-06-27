import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task3 {

    static String expand (String str){
        String [] arrOfStr = str.split(",");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arrOfStr));
        int i = 0;
        for(ListIterator<String> listIt = list.listIterator(); listIt.hasNext(); i++) {
            String s = new String();
            s = listIt.next();
            int first;
            int last;
            if(s.contains("-")) {
                String [] currS = new String[2];
                currS = s.split("-");
                first = Integer.parseInt(currS[0]);
                last = Integer.parseInt(currS[1]);
                int [] arr = new int[last - first+1];
                int tmp = 0;
                for(int j=first; j<=last; j++) {
                    arr[tmp] = j;
                    tmp++;
                }
                String l = "";
                for (int j = 0; j<arr.length; j++) {
                    if (j ==arr.length-1)
                        l+=arr[j];
                    else
                        l+=arr[j] + ",";
                }
                listIt.set(l);
            }
        }
        String N = "";
        for(int j = 0; j <list.size(); j++) {
            if(j==list.size()-1)
                N+= list.get(j);
            else
                N+= list.get(j) + ",";
        }
        return N;
    }

    public static void main(String[] args){
        String Str = "1,2,4-7,18-21";
        String outStr = expand(Str);
        System.out.println(outStr);
    }
}