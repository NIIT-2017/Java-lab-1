public class CollatzResearch{
    public static void main(String[] args) {
        int interval = 1000000;
        if (args.length > 0)
            interval = Integer.parseInt(args[0]);
        Collatz collatz = new Collatz();
        collatz.findLongestSequence(interval);
        System.out.println("The longest sequence = " + collatz.getLongest());
        System.out.println("For number = " + collatz.getNumber());
    }
}

class Collatz {

    private int longest;
    private int number;

    public int getLongest(){
        return longest;
    }

    public int getNumber(){
        return number;
    }

    private long nextItem(long N){
        if (N == 1)
            return 1;
        else if (N % 2 == 1)
            return N * 3 + 1;
        else
            return N / 2;
    }

    private int howLongSequence(long N){
        if (N <= 0)
            return 0;

        int length = 1;

        while(N != 1){
            length++;
            N = nextItem(N);
        }

        return length;
    }

    public void findLongestSequence(int interval){
        int buf = 1;
        for (int i = 1; i <= interval; i++) {
            buf = howLongSequence(i);
            if (buf > longest){
                longest = buf;
                number = i;
            }
        }
    }
}
