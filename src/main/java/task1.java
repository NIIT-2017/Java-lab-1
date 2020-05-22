public class task1 {

    private static int maxSequence = 0;

    static int collatz (int k){
        int sequence = 1;
        long num = k;
        while (num != 1){
            if ((num%2) == 0){
                num = num /2;
            }
            else{
                num = num*3 +1;
            }
            sequence++;
        }
        return sequence;
    }

    static int maxCollatz (int x, int y){
        int max = 0;
        int maxNumber = 0;
        for (int i = x; i <= y; i++){
            max = collatz(i);
            if (max > maxSequence){
                maxSequence = max;
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public static void main(String[]args){
        System.out.println("Привет это программа вычисления последовательности Коллатца");
        int x = 1;
        int y = 1000000;
        int maxNumber = maxCollatz(x,y);
        System.out.println("Результат программы: " + maxNumber +" , "+ maxSequence);
    }
}
