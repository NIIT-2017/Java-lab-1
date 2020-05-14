public class Task1 {
    static long maxlen = 0;
    static long num = 0;

    public static long collatz(long num){
        if (num == 1){
            return 1;
        }
        if (num % 2 == 0){
            return 1 + collatz(num / 2);
        } else {
            return 1 + collatz(3 * num + 1);
        }
    }
    public static long seqCollatz(){
        long maxlength = 0;
        for (int i = 2; i <= 1000000; i++)
        {
            num = collatz(i);
            if (num> maxlen){
                maxlen=num;
                maxlength = i;
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        System.out.println ("Максимальное число " + seqCollatz());
        System.out.println ("Длина последовательности " + maxlen);
    }
}
//output Максимальное число 837799
//Длина последовательности 525