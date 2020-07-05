class Collatz {

    long MaxLens = 0;
    long number = 0;

        public long collatz(long num) {
            if (num == 1) {
                return 1;
            }
            if (num % 2 == 0) {
                return 1 + collatz(num / 2);
            } else {
                return 1 + collatz(3 * num + 1);
            }
        }

        public long MaxCollatz() {
            long length = 0;
            for (int i = 2; i <= 1000000; i++) {
                number = collatz(i);
                if (number > MaxLens) {
                    MaxLens = number;
                    length = i;
                }
            }
            return length;
        }
}

public class task1{
    public static void main(String[] args) {
        Collatz c = new Collatz();
        System.out.println(c.collatz(20));
    }
}