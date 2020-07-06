public class Collatz {

    static int curr_len = 0;

    static long collatz(long num) {
        if (num != 1) {
            curr_len++;
            if (num % 2 != 0) {
                num = num * 3 + 1;
            } else {
                num = num / 2;
            }
            collatz(num);
        } else {
            curr_len++;
        }
        return curr_len;
    }

    public static void seqCollatz() {
        for (long num = 1; num <= 1000000; num++) {
            curr_len = 0;
            collatz(num);
            if (curr_len > Task1.maxlen) {
                Task1.maxlen = curr_len;
                Task1.maxnum = num;
            }
        }
    }
}