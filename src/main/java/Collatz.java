public class Collatz
{
    public static long collatz(long n, long count) {
        if (n == 1) return count;
        else if (n % 2 == 0) count = collatz(n / 2, count+1);
        else count = collatz(3*n + 1, count+1);
        return count;
    }
    public static void main(String[] args) {
        long len = 0;
        long maxLen = 0;
        long number = 0;
        for (long N=2;N<=1000000;N++){
            len = collatz(N, 1);
            if (len>maxLen){
                maxLen=len;
                number = N;
            }
        }
        System.out.println("У числа " + number + " максимальная длина ряда Коллатса:" + maxLen);
    }
}