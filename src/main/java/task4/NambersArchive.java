package task4;
//import javax.swing.*;
import java.util.Scanner;

public class NambersArchive {

    public static String archive (String line){
        String met[] = line.split(",");
        int[] numbers = new int[met.length + 1];
        StringBuilder string = new StringBuilder();
        //string.append();
        for (int i = 0; i < met.length; i++)
            numbers[i] = Integer.parseInt(met[i]);

        for(int j = 0; j < numbers.length - 1 ; j++) {
            string.append(numbers[j]);

            if(numbers[j] == numbers[j + 1] - 1 && numbers[j + 1] == numbers[j + 2] - 1) {
                while (j < numbers.length - 1 && numbers[j] == numbers[j + 1] - 1)
                    j++;
                string.append("-");
                string.append(numbers[j]);

                if(j < numbers.length - 1)
                    string.append(",");
            }
            else
                string.append(",");
        }
        return (string.toString()).substring(0,(string.toString()).length() - 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your numbers: ");
        String line = in.nextLine();
        archive(line);
        System.out.print(archive(line));
    }
}
