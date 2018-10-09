package collatz;

import java.util.Map;
import java.util.TreeMap;

public class Collatz {

    public static int collatz(int val) {
        int step = 0;
        long rez = val;

        while (rez > 1){
            if (rez % 2 == 0)
                rez = rez / 2;
            else
                rez = 3 * rez + 1;
            step++;
        }
        return step;
    }

    public static Map<Integer, Integer> findMaxSequence(int val){
        int maxLen = 0;
        int maxVal = 0;
        if (val<0) throw new NumberFormatException();
        for (int i = 0; i <= val; i++) {
            int len = collatz(i);
            if (len > maxLen) {
                maxLen = len;
                maxVal = i;
            }
        }
        Map<Integer,Integer> rez = new TreeMap();
        rez.put(maxLen, maxVal);
        return rez;
    }

    public static void main(String[] args) {
        try {
            int val = Integer.parseInt(args[0]);
            int sequenceLength = findMaxSequence(val).keySet().iterator().next();
            System.out.println("Наибольшая длина последовательности - "+sequenceLength+" для числа "+findMaxSequence(val).get(sequenceLength));
        }catch (Exception e){
            System.err.println("Введены неверные символы!");
            System.out.println("Введите целое неотрицательное число");
            throw new NumberFormatException();
        }
    }
}
