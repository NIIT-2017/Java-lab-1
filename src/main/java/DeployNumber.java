import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DeployNumber {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        String s = args[0];
        List<Integer> list=res(s);
        for (int l = 0; l<list.size();l++)
            System.out.print(list.get(l) + " ");

    }
static List<Integer> res(String s){

        String[] parts = s.split(",");
        List<Integer> list = new ArrayList<>();
        for (String part : parts) {
            if (part.contains("-")) {
                String[] range = part.split("-");
                int start = Integer.parseInt(range[0]);
                int end = Integer.parseInt(range[1]);

                for (int i=start; i <= end; ++i) {
                    list.add(i);

                }
            }
            else {
                int value = Integer.parseInt(part);
                list.add(value);

            }
        }
        Collections.sort(list);
        return list;
    }
}

