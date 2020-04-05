public class Kolatc {

    private static int max = 0;

    public static int collatz(long num){
        if (num == 1)
        {
            return 1;
        }
        if ((num % 2) == 0)
        {
            num = num / 2;
            return collatz(num)+1;
        }
        else
        {
            num = 3 * num + 1;
            return collatz(num)+1;
        }
    }
    public static long maxcollatz(int a, int b)
    {
        int count = 0;
        long maxnum = 0;
        for (long i = a;i<b;i++)
        {
            count = collatz(i);
            if (max<count)
            {
                max = count;
                maxnum = i;
            }
        }
        return maxnum;
    }

    public static void main(String[] args) {
        long result = maxcollatz(2,1000000);
        System.out.println("У числа - "+result+" длина последовательности Коллатца - "+max);
    }
}
