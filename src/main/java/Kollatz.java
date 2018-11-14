public class Kollatz
{
    private static long maxSteps = 0;
    private static long currentSteps = 0;

    public static void main() {
        counter();
    }

    public static long counter(){
        for (long initial = 1; initial < 1000000; initial++) {
            currentSteps = kollatz(initial, 1);
            if (currentSteps > maxSteps){
                maxSteps = currentSteps;
            }
        }
        return maxSteps;
    }

    private static long kollatz(long currentKollatz, int count) {
        if (currentKollatz == 1) return count;
        else if (currentKollatz % 2 == 0) currentKollatz = currentKollatz / 2;
        else currentKollatz = 3 * currentKollatz + 1;
        count++;
        return kollatz(currentKollatz, count);
    }
}