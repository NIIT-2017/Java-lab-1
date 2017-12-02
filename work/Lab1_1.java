public class Lab1_1 {
// Найти наибольшую последовательность Коллатца для чисел в диапазоне от 1 до 1000000

    static long func_count(long n){

        if (n % 2 == 0) {
            // System.out.println("counter");
            n = n / 2;
        } else {
            // System.out.println("no counter");
            n = n * 3 + 1;
        }

        // System.out.println("step = "+step);
        //System.out.println("n = "+i+" step = "+step);
        return n;

    }

    public static void main(String [] args)
    {
        long max_n = 0;
        String max_posl = "";
        long n = 0;
        int step = 0;
        int max_step = 0;
       //String posl = "";

        for (int i = 1; i<=1000000;i++) {
            n=i;
            step = 0;
            while (n > 1) {
                n = func_count(n);
                step++;
            }
            if (max_step < step) {
                max_step = step;
                max_n = i;
            }
        }

        System.out.println(max_step+" - "+max_n);

        /*
        System.out.println("max_step = "+max_step);
        System.out.println("max_n = "+max_n);

        //для вывода последовательности
        n = max_n;
        while (n > 1) {
            n = func_count(n);
            max_posl = max_posl+" "+n;
        }

        System.out.print("max_posl = "+max_posl);
        */

    }


}
