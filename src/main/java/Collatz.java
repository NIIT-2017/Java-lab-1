
import java.util.HashMap;

public class Collatz {

    public static long lenCollatz(long namber) {
        long len;
        for (len = 0; namber != 1; len++) {
            if (namber % 2 == 0) {
                namber = namber / 2;
            } else {
                namber = namber * 3 + 1;
            }
        }
        return len;
    }

    public static HashMap maxLenCollatx(long min, long max) {
        long maxLenKollatz = 0;
        long maxNamberKollatz = 0;
        long lenKollatz;
        for (long i = min; i < max; i++) {
            lenKollatz = lenCollatz(i);
            if (lenKollatz > maxLenKollatz) {
                maxLenKollatz = lenKollatz;
                maxNamberKollatz = i;
            }
        }
        HashMap<String, Long> hashMap = new HashMap<String, Long>();    //Через множества интереснее:)))
        hashMap.put("namber", new Long(maxNamberKollatz));
        hashMap.put("len", new Long(maxLenKollatz));
        return hashMap;
    }


    public static void main(String[] args) {
        HashMap naberAndLen = maxLenCollatx(1, 1000000);
        System.out.print("The number having the maximum length of the collatz sequence: " + naberAndLen.get("namber") +
                ", its length is: " + naberAndLen.get("len") + "\n");
    }
}
