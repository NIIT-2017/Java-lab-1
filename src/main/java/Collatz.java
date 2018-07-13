public class Collatz {

    public static int collatz(long x) {
        int count = 0;
        while (x>1) {
            x = (x % 2 == 0) ? x / 2 : x * 3 + 1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int countCollatz = 0;
        int max=1;
        int indexOfMax = 1;
        for (int i = 1; i < 1000000; i++) {
            countCollatz = collatz(i);
        if (countCollatz>max){
            max=countCollatz;
            indexOfMax=i;
        }
    }
        System.out.println("Наибольшая последовательность Коллатца " +indexOfMax);
    }
}
