public class CollatzDemo
{
    public static void printQmax1tol(int length) {
        System.out.print("Collatz Qmax 1 to " + length + " = " + Collatz.collatz1tol(length) + ". ");
    }
    public static void main(String[] args) {
        printQmax1tol(1000000);
    }
}
