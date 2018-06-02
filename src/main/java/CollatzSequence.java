public class CollatzSequence {

    public static long collatzNum(long num) {
        long step = 1;
        for (; num != 1;step++) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 != 0) {
                num = num * 3 + 1;
            }
        }
        return step;
    }
}
