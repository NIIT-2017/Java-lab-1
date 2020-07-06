import java.util.Scanner;

public class Number_queue {
    public static int[] Generating(String inter) {
        int[] number_queue;
        String Predel[] = inter.split("-");
        if (Predel.length == 1) {
            number_queue = new int[1];
            number_queue[0] = Integer.parseInt(Predel[0]);
        } else {
            int start = Integer.parseInt(Predel[0]);
            int end = Integer.parseInt(Predel[1]);
            number_queue = new int[end - start + 1];
            for (int i = start; i <= end; i++)
                number_queue[i - start] = i;
        }
        return number_queue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your numbers queue: ");
        String line = in.nextLine();
        String Line[] = line.split(",");
        for (int i = 0; i < Line.length; i++) {
            int[] numbers = Generating(Line[i]);
            for (int j = 0; j < numbers.length; j++) {
                if (i ==Line.length - 1 && j == numbers.length - 1)
                    System.out.print(numbers[j]);
                else
                    System.out.print(numbers[j] + ",");
            }
        }
    }
}