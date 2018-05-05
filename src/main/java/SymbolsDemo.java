public class SymbolsDemo
{
    public static void printSymbols(String string) {
        System.out.print(string + ".\n");
        Symbols.symbols(string);
    }
    public static void main(String[] args) {
        printSymbols("012345");
    }
}
