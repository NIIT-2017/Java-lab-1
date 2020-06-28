public class Task1 {

    public static void main(String[] args) {
        Task1 maxNumber = new Task1();
        int maxN = maxNumber.seqCollatz();
        System.out.println("Число = " + maxNumber.seqCollatz() + " имеет максимальную последовательность " + maxNumber.collatz(maxN));
    }

    int seqCollatz() {
        int length = 0;
        int maxLen = 0;
        int maxNum = 0;

        for (int n = 2; n < 1000000; n++) {
            length = collatz(n);

            if (length > maxLen) {
                maxLen = length;
                maxNum = n;
            }
        }
        return maxNum;
    }

    int collatz(long num) {
        if (num == 1) {
            return 1;
        } else if (num % 2 != 0) {
            return collatz(num * 3 + 1) + 1;
        } else {
            return collatz(num / 2) + 1;
        }
    }
}