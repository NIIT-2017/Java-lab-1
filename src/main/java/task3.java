import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

class NumOut{
     String Deployment(String str) {
        String[] arr = str.split(",");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        int i = 0;
        for (ListIterator<String> List = list.listIterator(); List.hasNext(); i++) {
            String addAr = new String();
            addAr = List.next();
            int x, y;
            if (addAr.contains("-")) {
                String[] Buf = new String[2];
                Buf = addAr.split("-");
                x = Integer.parseInt(Buf[0]);
                y = Integer.parseInt(Buf[1]);
                int[] newArr = new int[y - x + 1];
                int temp = 0;
                for (int j = x; j <= y; j++) {
                    newArr[temp] = j;
                    temp++;
                }
                String StrNum = "";
                for (int j = 0; j < newArr.length; j++) {
                    if (j == newArr.length - 1)
                        StrNum += newArr[j];
                    else
                        StrNum += newArr[j] + ",";
                }
                List.set(StrNum);
            }
        }
        String str2 = "";
        for (int j = 0; j < list.size(); j++) {
            if (j == list.size() - 1)
                str2 += list.get(j);
            else
                str2 += list.get(j) + ",";
        }
        return str2;
    }
}

class task3{
    public static void main(String[] args){
        NumOut n = new NumOut();
        System.out.printf(n.Deployment("1-4"));
    }
}