public class NumInSym {

    public static void main(String[] args) {
        String input = "41072819";
        char[] str = input.toCharArray();
        Symbols figure=new Symbols();
        figure.choiceNumber(str);

        for (String line:figure.picture) {
            System.out.println(line);
        }
    }
}