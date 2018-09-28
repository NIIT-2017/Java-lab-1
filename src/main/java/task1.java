public class task1 {
    public static void main(String[] args) {

        System.out.println("Search for the largest Collatte sequence for numbers in the range from 1 to 1 000 000 ...");

        int result = 0;
        int maxSteps = 0;

        for (int i = 1; i <= 1000000; i++){
            int steps = Collatz(i);
            if(steps > maxSteps){
                maxSteps = steps;
                result = i;
            }
        }
        System.out.println("Max steps: " + maxSteps + " with number: " + result);
    }

    static int Collatz(int number){
        long value = number;
        int steps = 0;
        while (value != 1){
            steps++;
            if(value%2==0)
                value=value/2;
            else
                value=value*3+1;
        }
        return steps;
    }
}
