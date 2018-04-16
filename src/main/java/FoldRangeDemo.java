public class FoldRangeDemo
{
    public static void printFoldRange(String string) {
        System.out.println(string);
        FoldRange.foldRange(string);
    }
    public static void main(String[] args) {
        printFoldRange("1,3,6,7,9,11,12,13,16,18,20,21,22,23,24,25");
    }
}
