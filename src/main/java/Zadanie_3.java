import java.util.ArrayList;

public class Zadanie_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String line = args[0];
        String[] words = line.split(",");
        for (String i : words) {
            if (i.contains("-")) {
                String[] wordsNew = i.split("-");
                int a = Integer.parseInt(wordsNew[0]);
                int b = Integer.parseInt(wordsNew[1]);
                for (int x = a; x <= b; x++) {
                    list.add(a);
                    a++;
                }
            }
            else {
                int a = Integer.parseInt(i);
                list.add(a);
            }
        }
        for (int a = 0; a < list.size()-1; a++)
            System.out.print(list.get(a) + ", ");
        System.out.print(list.get(list.size()-1));
    }
}
