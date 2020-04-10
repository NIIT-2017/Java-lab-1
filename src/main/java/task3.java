import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.ArrayList;

public class task3 {
    // convert current number to string
    private static String addDigits(ArrayList<Character> buf) {
        StringBuilder sb = new StringBuilder();
        for (Character c : buf) sb.append(c);
        return sb.toString();
    }

    // write numbers from range a-b to string
    private static String addRange(int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (int j = a; j <= b; j++) {
            sb.append(j);
            sb.append(",");
        }
        return sb.toString();
    }

    public static String unfoldRange(String line) {
        ArrayList<Character> buf = new ArrayList<Character>(); // temporary list for digits of current number
        StringBuilder result = new StringBuilder(); // result string
        int a = 0, b = 0, flag = 0, i = 0;
        char ch; // current symbol of input string
        /*
        flag:
         0 - end of number or range
         1 - number
         2 - range
        -1 - negative number
        -2 - negative range
        */
        while (i < line.length()) {
            ch = line.charAt(i);
            if (ch == ',' && (flag == 1 || flag == -1)) {
                result.append(addDigits(buf)).append(","); // put single number to result string
                buf.clear(); // clear temporary list
                flag = 0;
                i++;
            } else if (ch == '-' && (flag == 1 || flag == -1)) {
                a = Integer.parseInt(addDigits(buf)); // write current number to a (range starts)
                buf.clear();
                flag = (flag == 1) ? 2 : -2;
                i++;
            } else if (ch == ',' && (flag == 2 || flag == -2)) {
                b = Integer.parseInt(addDigits(buf)); // write current number to b (range ends)
                result.append(addRange(a, b)); // put numbers from range to result string
                buf.clear();
                flag = 0;
                i++;
            } else if (ch == '-' && (flag == 0 || flag == -2)) {
                buf.add(ch); // add current symbol to temporary list
                flag = (flag == 0) ? -1 : -2;
                i++;
            } else if (Character.isDigit(ch)) {
                buf.add(ch);
                if (flag == 0) flag = 1;
                i++;
            }
        }
        // add last number or range
        if (flag == 2 || flag == -2) {
            b = Integer.parseInt(addDigits(buf));
            result.append(addRange(a, b));
            result.setLength(result.length() - 1);
        } else if (flag == 1 || flag == -1)
            result.append(addDigits(buf));
        buf.clear();
        return result.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.print("Введите числовые диапазоны");
            System.exit(-1);
        }
        System.out.println(unfoldRange(args[0])); // выводим результат на экран
    }
}
