import static dev.gord.out.Output.*;
public class Collatz {

    public static long collatz(long n, long iter) {
        if(n == 1) return iter;
        else if(n % 2 == 0) return collatz(n / 2, iter + 1);
        else return collatz(n * 3 + 1, iter + 1);
    }

    public static long collatz(long n) {
        if(n == 1) return n;
        else if(n % 2 == 0) return collatz(n / 2);
        else return collatz(n * 3 + 1);
    }

    public static void maxCollatzSequence(long start, long end) {

        // Main variables
        long maxSequence = 0;
        long maxNumberOfSequence = 0;
        long iter;

        // Iteration
        for (long i = start; i <= end; i++) {
            iter = Collatz.collatz(i, 0);
            if(iter > maxSequence) {
                maxSequence = iter;
                maxNumberOfSequence = i;
            }
        }

        printf("Max sequence of Collatz: %d with number %d", maxSequence, maxNumberOfSequence);

    }

    public static void main(String[] args) {
        Collatz.maxCollatzSequence(1, 1000000);
    }

}
