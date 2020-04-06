public class task1 {
    public static void main (String[] args){
        System.out.println("the biggest sequense is " + collatz(seqCollatz()) + " from the number " + seqCollatz());
    }
    public static int seqCollatz(){
        int length;
        int maxNumber = 0;
        int maxLen = 0;
        for (int i = 2; i <= 1000000; i++)
        {
            length = collatz(i);
            if (length > maxLen)
            {
                maxLen = length;
                maxNumber = i;
            }
        }
        return maxNumber;
    }
    public static int collatz(long num){
        if (num == 1) return 1;

        if (num % 2 == 0) {
            return 1 + collatz(num / 2);
        } else {
            return 1 + collatz(3 * num + 1);
        }
    }
}