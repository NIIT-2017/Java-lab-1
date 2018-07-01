public class Collatz {

    public static int collatz2(long n) {

        if (n == 1) {
            return 1;
        }
        else if (n % 2 == 0) {
            return collatz2(n / 2)+1;
        }
        else {
            return collatz2(3 * n + 1) + 1;
        }
    }

    public static void main(String[] args) {

        int maxSeq = 0;
        int seq;
        long i;
        for (i = 1; i <= 1_000_000; i++) {
            seq = 0;
            seq = collatz2(i);
            if(maxSeq < seq) maxSeq = seq;
        }
        System.out.println("max " + maxSeq);
    }
}
