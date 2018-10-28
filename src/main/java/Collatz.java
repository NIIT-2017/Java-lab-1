public class Collatz {
    static long cnt = 1;
    static long[] array = new long[999999];
    static int l = 0;

    public static long collatz(long n) {

        long max = 0;
        long s = n;

        while (n != 1) {
            if (n % 2 == 0) {
                cnt++;
                n = n / 2;
            } else {
                cnt++;
                n = 3 * n + 1;
            }
        }
        if (n == 1) {
            array[l] = cnt;
            l++;
            cnt = 1;
        }

        if (s == 999999) {
            max = array[0];
            for (int k = 0; k < array.length; k++)
                if (max < array[k])
                    max = array[k];
        }

        return max;
    }

    public static void main(String[] args) {
        long res = 0;
        System.out.println("Поиск наибоольшей последовательности Коллатза в диапазоне от 1 до 1000000");

        for (int k = 1; k < 1000000; k++)
            res = collatz(k);
        System.out.println("Максимальная последовательность" + res);
    }
}
