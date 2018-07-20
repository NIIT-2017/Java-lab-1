import java.util.ArrayList;

public class Zadanie_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list1 = new ArrayList<String>();
        String line = "1,2,3,4,5,6,8,10,55,56,57,58,59,100";
        String[] words = line.split(",");
        for (String i : words) {
            int a = Integer.parseInt(i);
            list.add(a);
        }
        list1.add(String.valueOf(list.get(0)));
        for (int i = 1; i < list.size()-1; i++) {
            if (list.get(i) != list.get(i-1) + 1)
                list1.add("," + String.valueOf(list.get(i)));
            else if (list.get(i) + 1 != list.get(i+1))
                list1.add("-" + String.valueOf(list.get(i)));
        }
        if (list.get(list.size()-1) == list.get(list.size()-2) + 1)
            list1.add("-" + String.valueOf(list.get(list.size()-1)));
        else
            list1.add("," + String.valueOf(list.get(list.size()-1)));
        for (String a  : list1)
            System.out.print(a);
    }
}
