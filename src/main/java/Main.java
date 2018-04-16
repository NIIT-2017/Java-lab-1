public class Main
{
    public static void main(String[] args) {
        CollatzDemo.printQmax1tol(1000000);
        System.out.println();
        SqrtDemo.printSqrt(7,15);
        System.out.println();
        DeployRangeDemo.printDeployRange("1,2,3,5,8,10-11,13-15,18-22,23-28");
        System.out.println();
        FoldRangeDemo.printFoldRange("1,3,6,7,9,11,12,13,16,18,20,21,22,23,24,25");
        System.out.println();
        SymbolsDemo.printSymbols("012345");
        System.out.println();
        CircleDemo.exercise1(6378.1,0.001);
        CircleDemo.exercise2(3,1,1000,2000);
    }
}