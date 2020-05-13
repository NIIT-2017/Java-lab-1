import java.util.ArrayList;

public class task4 {
    private static String addDigits(ArrayList<Character> buf) {
        StringBuilder sb = new StringBuilder();
        for (Character c : buf) sb.append(c);
        return sb.toString();
    }

    private static ArrayList<Integer> readNumbers(String line) {
        ArrayList<Character> buf = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 0, flag = 0;
        char ch;
        while (i < line.length()) {
            ch = line.charAt(i);
            if (Character.isDigit(ch)) {
                buf.add(ch);
                if (flag == 0) flag = 1;
                i++;
            } else if (ch == '-' && flag == 0) {
                buf.add(ch);
                flag = -1;
                i++;
            } else if (ch == ',') {
                numbers.add(Integer.parseInt(addDigits(buf)));
                buf.clear();
                flag = 0;
                i++;
            }
        }
        numbers.add(Integer.parseInt(addDigits(buf)));
        buf.clear();
        return numbers;
    }

    private static String addFoldedRange(int a, int b, int ia, int ib) {
        StringBuilder sb = new StringBuilder();
        if (ia == ib) {
            sb.append(b);
            sb.append(",");
        } else if (ib - ia == 1) {
            sb.append(a);
            sb.append(",");
            sb.append(b);
            sb.append(",");
        } else if (ib - ia != 1) {
            sb.append(a);
            sb.append("-");
            sb.append(b);
            sb.append(",");
        }
        return sb.toString();
    }

    public static String fillResult(String line) {
        ArrayList<Integer> num = readNumbers(line);
        StringBuilder result = new StringBuilder();
        int a, b, i = 0, ia, ib;
        a = num.get(i);
        ia = i;
        i = 1;
        while (i < num.size()) {
            if (num.get(i) - num.get(i - 1) != 1) {
                b = num.get(i - 1);
                ib = i - 1;
                result.append(addFoldedRange(a, b, ia, ib));
                a = num.get(i);
                ia = i;
                i++;
            } else if (num.get(i) - num.get(i - 1) == 1) {
                i++;
            }
        }
        b = num.get(i - 1);
        ib = i - 1;
        result.append(addFoldedRange(a, b, ia, ib));
        result.setLength(result.length() - 1);
        return result.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.print("Введите числа через запятую");
            System.exit(-1);
        }
        System.out.println(fillResult(args[0]));
    }
}
