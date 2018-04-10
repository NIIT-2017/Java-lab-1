public class Collatz {
    public static int findLen(long num) {
        int len = 1;
        while (num != 1)
        {
            if ((num % 2) == 1){
                num = 3*num + 1;
            }
            else {
                num /= 2;
            }
            len++;
        }
        return len;
    }
    public static long[] findMaxLen() {
        long[] arr = new long[] {0,0};
        int maxLen = 0;
        long startNum = 0;
        for (long k = 1; k <= 1000000; k++) {
            int currLen = findLen(k);
            if (currLen > maxLen) {
                maxLen = currLen;
                startNum = k;
            }
        }
        arr[0] = startNum;
        arr[1] = (long)maxLen;
        return arr;
    }
}
