public class Task1 {

    static long maxsq = 0;

    public static long sqCollatz() {
        long sq = 0, number = 2;
        for (long i = 2; i < 1000000; i++) {
            sq = collatz(i);
            if (sq > maxsq) {
                maxsq = sq;
                number = i;
            }
        }
        return number;
    }

    public static long collatz(long number)
    {
        int date = 0;
        date++;
        if (number == 1)
            return number;
        else if (number % 2 != 0)
            return collatz(3 * number + 1) + 1;
        else if (number % 2 == 0)
            return collatz(number / 2) + 1;
        return date;
    }

    public static void main(String[] args) {
        System.out.println("Number is " + sqCollatz() + "\nMax length is " + maxsq);
    }
}
