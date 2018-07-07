package Collatz;

public class CollatzStart {
    static long count = 0;
    static long countMax = 0;
    static long numMax = 0;
    public static void main(String[] args) {
        for(long x=1; x<=1000000; x++) {
            collatz(x);
            if(count>countMax) {countMax=count; numMax=x;}
            count = 0;
        }
        System.out.println("Наибольшая длина последовательности "+countMax+" Для числа "+numMax);
    }

    public static long collatz(long x) {
        count++;
        if(x == 1) {return count;}
            else if(x % 2 == 0)  {collatz(x/2);}
                else {collatz(3*x+1);}
                return count;
    }
}
