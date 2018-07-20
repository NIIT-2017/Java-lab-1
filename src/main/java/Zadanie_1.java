import java.util.ArrayList;

public class Zadanie_1 {
    public static void main(String[] args) {
        ArrayList<Integer> chisla = new ArrayList<Integer>();
        for (int i = 0 ; i < 100000; i++)
            chisla.add(i+1);
        int max = 0;
        int porNomer = 0;



            for (int i = 0; i < 100000; i++) {
                int a = chisla.get(i);
                int s = schetchik(a);
                if (s > max) {
                    max = s;
                porNomer = i+1; }
            }
            System.out.println(porNomer);
        System.out.println(max);
        }
    public static int schetchik (int i) {
        int a = 0;
        while (i != 1) {
            if (i % 2 == 0) {
                i = i / 2;
                a++;
            } else {
                i = 3 * i + 1;
                a++;
            }
        }
        return a;
    }
    }