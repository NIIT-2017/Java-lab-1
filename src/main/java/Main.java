public class Main {

    public static void main(String args[]) {
        CollatzSequence mainCollatz = new CollatzSequence();
        long maxstep = 0;
        long step = 0;
        long maxnum = 0;
        for (long num = 1; num <= 1000000; num++) {
            step = mainCollatz.collatzNum(num);
            if (step > maxstep) {
                maxstep = step;
                maxnum = num;
            }
        }
        System.out.println("Наибольшая последовательность Коллатца для чисел в диапазоне от 1 до 1 000 000:"+
                maxstep + " у числа: " + maxnum);
    }

}
