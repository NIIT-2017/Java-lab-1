class Collatz {

    public static int collatz(long num) {

        int numberOfIterations = 1;

        while (num != 1) {
            numberOfIterations++;

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
        }
        return numberOfIterations;
    }


    public static void main(String args[]) {
        int maxNumberOfIterations = 1;
        int numberWithMaxSequence = 1;
        int Iterations = 0;

        for (int i = 1; i <= 1000000; i++) {

            Iterations = collatz(i);

            if (Iterations > maxNumberOfIterations) {
                maxNumberOfIterations = Iterations;
                numberWithMaxSequence = i;
            }
        }

        System.out.print("Max length of sequense is: " + maxNumberOfIterations+"."+
        " Number with max sequence is: " + numberWithMaxSequence+".");

    }
}