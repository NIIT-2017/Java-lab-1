public class L1T1v3
{
    static long chain(long n)
    {
        if (n == 1)
        {
            return 1;
        }
        else if (n % 2 == 0)
            return 1 + chain(n / 2);
        else
            return 1 + chain(3 * n + 1);
    }
    public static void main(String[] args)
    {
        long max = 1; long number = 1, cout;
        for (long i = 1; i <= 1000000; i++)
        {
            cout = chain(i);
            if (cout > max)
            {
                max = cout;
                number = i;
            }
        }
        System.out.println("number: "+number+" lenght: "+max);
    }
}
