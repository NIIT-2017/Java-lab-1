import java.util.ArrayList;

public class task3 {
    private static ArrayList<Character> arr = new ArrayList<Character>(); // список для хранения строки
    private static ArrayList<Character> arrChar = new ArrayList<Character>(); // временный список для хранения текущего числа
    private static StringBuilder result = new StringBuilder(); // конечная строка
    private static String buf = ""; // буферная строка для хранения числа

    private static String addDigits() {
        for (Character c : arrChar) {
            buf += String.valueOf(c);
        }
        return buf;
    }

    private static void addRange(int a, int b, int i) {
        for (int j = a + 1; j <= b; j++) {
            result.append(String.valueOf(j));
            result.append(",");
        }
        if (i == arr.size() - 1) result.setLength(result.length() - 1); // удаляем запятую в конце
    }

    public static String unfoldRange(String line) {
        int a = 0, b = 0, flag = 1, i = 0, j; // flag = 1 - цифра, flag = 2 - в диапазоне a-b, flag = 3 - диапазон a-b получен

        // конвертируем строку с входными данными в список arr
        for (j = 0; j < line.length(); j++) {
            arr.add(line.charAt(j));
        }
        arr.add(',');

        while (i < arr.size()) {
            if (Character.isDigit(arr.get(i)) && flag == 1) {
                arrChar.add(arr.get(i)); // заносим цифры числа в список
                i++;
            } else if ((arr.get(i) == ',' && flag == 1) || arr.get(i) == '-') {
                buf = addDigits(); // добавляем считанные цифры в строку
                result.append(buf); // заносим строку с числом в результирующий список
                if (arr.get(i) == '-') flag = 2; // изменяем значение flag если зашли в диапазон
                if (i != arr.size() - 1) result.append(","); // добавляем запятую для всех символов кроме последнего
                a = Integer.parseInt(buf); // конвертируем строку в число и заносим число как a
                arrChar.clear(); // очищаем список
                buf = ""; // очищаем буферную строку
                i++;
            } else if (Character.isDigit(arr.get(i)) && flag == 2) {
                arrChar.add(arr.get(i)); // заносим цифры по одной
                i++;
            } else if ((arr.get(i) == ',' && flag == 2)) {
                buf = addDigits(); // добавляем считанные цифры в строку
                arrChar.clear(); // очищаем список
                b = Integer.parseInt(buf); // конвертируем строку в число и заносим число как b
                buf = ""; // очищаем буферную строку
                flag = 3; // изменяем значение flag т.к. имеется диапазон a-b
            } else if (flag == 3) {
                addRange(a, b, i); // заносим числа из диапазона a-b в результирующий список
                flag = 1;
                i++;
            }
        }
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
