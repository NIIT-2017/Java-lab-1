public class Task4 {

    public static void main(String[] args) {

        if(args.length == 0)
            return;

        String text = args[0];
        System.out.println(args[0]);

        System.out.println(convolution(text));
    }

    public static String convolution(String text) {
        String[] words = text.split(",");
        StringBuilder string = new StringBuilder();
        string.append(words[0]);
        int flag = 0;
        int previous = 0;
        int current = 0;
        int i = 1;
        for (; i < words.length; i++) {
            previous = Integer.parseInt(words[i - 1]);
            current = Integer.parseInt(words[i]) - 1;

            if ((previous == current) && (flag == 0)) {
                flag = 1;
                string.append("-");
            } else if ((current == previous) && (flag != 0)) {
                continue;
            } else if ((current != previous) && (flag == 1)) {
                string.append(words[i - 1]);
                string.append(",");
                string.append(words[i]);
                flag = 0;
            } else {
                string.append(",");
                string.append(words[i]);
            }
        }
        if (previous == current) {
            string.append(words[--i]);
        }
        return string.toString();
    }
}
