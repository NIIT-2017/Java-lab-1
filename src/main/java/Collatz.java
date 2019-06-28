public class Collatz {
    public static long collatz(long n) {
        if (n == 1) return 1;
        else if (n % 2 == 0) {
            return 1 + collatz(n / 2);
        } else {
            return 1 + collatz(3 * n + 1);
        }
    }

    public static void main(String[] args) {
        long countMax = 0;
        long n = 0;
        long curent;
        for (long i = 1; i <= 1000000; i++) {
            curent = collatz(i);
            if (countMax < curent) {
                countMax = curent;
                n = i;
            }
        }
        System.out.println("number-" + n + " count-" + countMax);
    }
}



