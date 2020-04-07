import java.util.ArrayList;

public class task4 {
    private static ArrayList<Character> arr = new ArrayList<Character>();
    private static ArrayList<Character> arrChar = new ArrayList<Character>();
    private static ArrayList<Integer> numbers = new ArrayList<Integer>();
    private static StringBuilder result = new StringBuilder();
    private static String buf = "";

    private static String addDigits() {
        for (Character c : arrChar) {
            buf += String.valueOf(c);
        }
        return buf;
    }

    private static void readNumbers() {
        int i = 0;
        while (i < arr.size()) {
            if (Character.isDigit(arr.get(i))) {
                arrChar.add(arr.get(i));
                i++;
            } else if (arr.get(i) == ',') {
                buf = addDigits();
                numbers.add(Integer.parseInt(buf));
                arrChar.clear();
                buf = "";
                i++;
            }
        }
        numbers.add(numbers.get(numbers.size() - 1));
    }

    public static String fillResult(String line) {
        int a, b, i = 0, ia, ib, j;

        // конвертируем строку с входными данными в список arr
        for (j = 0; j < line.length(); j++) {
            arr.add(line.charAt(j));
        }
        arr.add(',');

        readNumbers(); // считываем числа в массив int

        a = numbers.get(i);
        ia = i;
        i = 1;
        while (i < numbers.size()) {
            if (i == numbers.size() - 1 || numbers.get(i) - numbers.get(i - 1) != 1) {
                b = numbers.get(i - 1);
                ib = i - 1;
                if (ia == ib) {
                    result.append(b);
                    result.append(",");
                } else if (ib - ia == 1) {
                    result.append(a);
                    result.append(",");
                    result.append(b);
                    result.append(",");
                } else if (ib - ia != 1) {
                    result.append(a);
                    result.append("-");
                    result.append(b);
                    result.append(",");
                }
                a = numbers.get(i);
                ia = i;
                i++;
            } else if (numbers.get(i) - numbers.get(i - 1) == 1) {
                i++;
            }
        }
        removeLastComma();
        return result.toString();
    }

    private static void removeLastComma() {
        if (result.length() > 0)
            result.deleteCharAt(result.length() - 1);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.print("Введите числа через запятую");
            System.exit(-1);
        }
        System.out.println(fillResult(args[0]));
    }
}
