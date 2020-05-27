package task3;
import java.util.Scanner;

public class Nambers {
    public static int[] transfer(String inter) {
        int[] numbers;
        String limits[] = inter.split("-");
        if (limits.length == 1) {
           numbers = new int[1];
            numbers[0] = Integer.parseInt(limits[0]);
        } else {
            int start = Integer.parseInt(limits[0]);
            int end = Integer.parseInt(limits[1]);
            numbers = new int[end - start + 1];
            for (int i = start; i <= end; i++)
                numbers[i - start] = i;
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        String line = in.nextLine();
        String met[] = line.split(",");
        for (int i = 0; i < met.length; i++) {
            int[] numbers = transfer(met[i]);
            for (int j = 0; j < numbers.length; j++) {
                if (i == met.length - 1 && j == numbers.length - 1)
                    System.out.print(numbers[j]);
                else
                    System.out.print(numbers[j] + ",");
            }
        }
    }
}
