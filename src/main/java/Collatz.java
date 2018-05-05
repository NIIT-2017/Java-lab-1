public class Collatz
{
    public static int collatz(long n, int k) {
        if (n == 1 & ++k != 1) return k;
        if (n % 2 == 0) return collatz(n / 2, k);
        else return collatz(3 * n + 1, k);
    }
    public static int collatz1tol(int l) {
        int qmax = 1, q;
        for(int i=1; i <= l; i++) {
            q = collatz(i,0);
            if (q > qmax) qmax = q;
        }
        return qmax;
    }
}
