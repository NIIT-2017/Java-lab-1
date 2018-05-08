public class SymbolsDemo
{
    public static String[][] construct(Symbols.ModeLine mLine, String string) {
        return Symbols.numbers(mLine, string);
    }
    public static String buildWay1(Symbols.ModeLine mLine, String string) {
        String[][] symbols = construct(mLine, string);
        return concat(string, symbols, symbols.length, symbols[0].length);
    }
    public static String buildWay2(Symbols.ModeLine mLine, String string) {
        Symbols.setSymbols(mLine, string);
        return concat(string, Symbols.getSymbols(), Symbols.getLineCount(), Symbols.getColCount());
    }
    public static String buildWay3(Symbols.ModeLine mLine, String string) {
        return concat(string, Symbols.numbers(mLine, string), Symbols.getLineCount(), Symbols.getColCount());
    }
    public static String concat(String string, String symbols[][], int lineCount, int colCount) {
        for(int i=0; i < lineCount; i++) {
            string += "\n";
            for (int j=0; j < colCount; j++) string += symbols[i][j];
        }
        return string + "\n";
    }
    public static String ex1() {
        return buildWay1(Symbols.ModeLine.SEVEN,"01234");
    }
    public static String ex2() {
        return buildWay2(Symbols.ModeLine.FIVE,"0123456789");
    }
    public static String ex3() {
        return buildWay2(Symbols.ModeLine.SEVENNUM,"56789");
    }
    public static String ex4() {
        return buildWay3(Symbols.ModeLine.FIVENUM,"0123456789");
    }
    public static String ex5() {
        return buildWay3(Symbols.ModeLine.ONEWORD,"0123456789");
    }
    public static String ex6() {
        return buildWay3(Symbols.ModeLine.ONENUM,"0123456789");
    }
    public static String examples() {
        return ex1()+ex2()+ex3()+ex4()+ex5()+ex6();
    }
    public static void show(String message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        show(examples());
    }
}
