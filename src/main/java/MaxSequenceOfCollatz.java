
public class MaxSequenceOfCollatz {
    public static long collatz(long n) {
        if (n == 1) {
            return 1;
        }
        else if (n % 2 == 0) {
            return 1+collatz(n / 2);
        }
        else {
            return 1+collatz(3*n + 1);
        }
    }
    public static long MaxSequence () {
        long length = 0;
        long maxLength = 0;
        long number = 0;
        for (long i = 1; i < 1000000; i++) {
            length = collatz(i);
            if (length > maxLength) {
                maxLength = length;
                number = i;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println("The longest Sequence of Collatz in the range between 1 - 1000000 looks like: length - "
                + collatz(MaxSequence()) + " number - " + MaxSequence());
    }
}


