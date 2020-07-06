import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        if(args.length == 0)
            return;

        String text = args[0];
        System.out.println(args[0]);
        String interval[] = text.split(",");
        for (int i = 0; i < interval.length; i++) {
            int[] numbers = sequence(interval[i]);
            for (int j = 0; j < numbers.length; j++) {
                if (i == interval.length - 1 && j == numbers.length - 1)
                    System.out.print(numbers[j]);
                else
                    System.out.print(numbers[j] + ",");
            }
        }
    }

    public static int[] sequence(String interval) {
        int[] counter;
        String limits[] = interval.split("-");
        if (limits.length == 1) {
            counter = new int[1];
            counter[0] = Integer.parseInt(limits[0]);
        } else {
            int start = Integer.parseInt(limits[0]);
            int end = Integer.parseInt(limits[1]);
            counter = new int[end - start + 1];
            for (int i = start; i <= end; i++)
                counter[i - start] = i;
        }
        return counter;
    }

}



