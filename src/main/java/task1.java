public class task1 {
    static long maxlen = 0;
    static int count = 0;
    public static long seqCollatz(){
        long i, len = 0, number = 2;
        for (i = 2; i < 1000000; i++) {
            len = collatz(i);
            if (len > maxlen) {
                maxlen = len;
                number = i;
            }
        }
        return number;
    }

    public static long collatz(long num)
    {
        count++;
        if (num == 1)
            return num;
        else if (num % 2 != 0)
            return collatz(3 * num + 1) + 1;
        else if (num % 2 == 0)
            return collatz(num / 2) + 1;
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number is " + seqCollatz() + ", max length is " + maxlen);
    }
}