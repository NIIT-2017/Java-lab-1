import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Дорогой пользователь, введите числовую строку для анализа");
        Scanner in = new Scanner(System.in);
        String text = in.next();
        System.out.println(sequence(text));
    }

    public static String sequence(String text){
        String[] words = text.split(",");
        StringBuilder string = new StringBuilder();
        for (String word : words) {
            if (word.matches("-{1}(.+)-{2}(.+)")) {
                word = word.substring(1);
                word = word.replaceAll("-{2}", "-");
                String[] bufer = word.split("-");
                int n = Integer.parseInt(bufer[0]) * -1;
                int m = Integer.parseInt(bufer[1]) * -1;
                if (n <= m){
                    for (; n <= m; n++) {
                        string.append(Integer.toString(n));
                        string.append(",");
                    }
                } else {
                    for (; n >= m; n--) {
                        string.append(Integer.toString(n));
                        string.append(",");
                    }
                }
            } else if (word.matches("-{1}(.+)-{1}(.+)")) {
                word = word.substring(1);
                String[] bufer = word.split("-");
                int n = Integer.parseInt(bufer[0]) * -1;
                int m = Integer.parseInt(bufer[1]);
                for (; n <= m; n++) {
                    string.append(Integer.toString(n));
                    string.append(",");
                }
            } else if (word.matches("-{0}(.+)-{2}(.+)")) {
                word = word.replaceAll("-{2}", "-");
                String[] bufer = word.split("-");
                int n = Integer.parseInt(bufer[0]);
                int m = Integer.parseInt(bufer[1]) * -1;
                for (; n >= m; n--) {
                    string.append(Integer.toString(n));
                    string.append(",");
                }
            } else if (word.matches("-{0}(.+)-{1}(.+)")) {
                String[] bufer = word.split("-");
                int n = Integer.parseInt(bufer[0]);
                int m = Integer.parseInt(bufer[1]);
                if (n <= m){
                    for (; n <= m; n++) {
                        string.append(Integer.toString(n));
                        string.append(",");
                    }
                } else {
                    for (; n >= m; n--) {
                        string.append(Integer.toString(n));
                        string.append(",");
                    }
                }
            } else {
                string.append(word);
                string.append(",");
            }
        }
        string.setLength((string.length() - 1));
        return string.toString();
    }
}
