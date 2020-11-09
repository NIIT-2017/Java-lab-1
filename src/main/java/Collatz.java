class Collatz
{
    private long maxSequence = 0;
    private int count = 0;
    private long result = 0;
    private long temp = 0;
    private long Result_number;
    public  long setMaxSequence(long num) {
        temp = num;
        while (temp!=1) {
            if (temp % 2 == 0) {
                count++;
                result = temp / 2;
                temp = result;
            } else {
                count++;
                result = temp * 3 + 1;
                temp = result;
            }
        }
        if (count >= maxSequence) {
            maxSequence = count;
            Result_number = num;

        }
        count = 0;return maxSequence;
    }
    public  long getResult_number() {
        return Result_number;
    }
}

class Task1 {
    public static void main(String[] args) {
        Collatz object = new Collatz();
        long result = 0;
        for (long i = 1; i <= 1_000_000; i++)
            result = object.setMaxSequence(i);
        long result2 = object.getResult_number();
        System.out.println("Sequence consist of " + result + " steps");
        System.out.println("This number is " + result2);
    }
}
