public class Task1 {

    public static long Collatc(long x) {
        if (x == 1)
            return 1;
        else if (x % 2 == 0)
            return 1 + Collatc(x / 2);
        else
            return 1 + Collatc(x * 3 + 1);
    }
    public static long MaxLength() {
        long Num = 0; long MaxNum = 0; long count = 0;
        for (long i = 2; i < 1000000; i++) {
            Num = Collatc(i);
            if (Num > MaxNum) {
                MaxNum = Num;
                count = i;
            }
        }
        return count;
    }
    public static void main(String[] args) {
    System.out.println("Число: " + MaxLength()+ " Последовательность: " +Collatc(MaxLength()));
    }
}