import java.util.Scanner;
import java.util.ArrayList;

public class Task3 {
    public static int[] find(String st)
    {
        int [] Num;
        String limits[] = st.split("-");
        if (limits.length == 1)
        {
            Num = new int[1];
            Num [0] = Integer.parseInt(limits[0]);
        } else
        {
            int a = Integer.parseInt(limits[0]);
            int x = Integer.parseInt(limits[1]);
            Num = new int[x - a + 1];
            for (int i = a; i <= x; i++)
                Num[i - a] = i;
        }
        return Num;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter interval your numbers: ");
        String st = in.nextLine();
        String arr[] = st.split(",");
        for (int i = 0; i < arr.length; i++)
        {
            int[] numbers = find(arr[i]);
            for (int j = 0; j < numbers.length; j++)
            {
                if (i == arr.length - 1 && j == numbers.length - 1)
                    System.out.print(numbers[j]);
                else
                    System.out.print(numbers[j] + ",");
            }
        }
    }
} 