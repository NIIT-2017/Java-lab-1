public class CollatzDemo
{
    public static int collatz1tolMath(int length) {
        return Collatz.collatz1tol(length);
    }
    public static int collatz1to1000000Res() {
        return collatz1tolMath(1000000);
    }
    public static String collatz1tolStr(int length) {
        return ("Collatz Qmax 1 to " + length + " = " + collatz1tolMath(length) + "." + "\n");
    }
    public static String collatz1to11tolStr(int length) {
        String string = new String();
        for(int i=0; i < length; i++) string += collatz1tolStr(i+1);
        return string;
    }
    public static String collatz1to11to10() {
        return collatz1to11tolStr(10);
    }
    public static String collatz1to1000000() {
        return collatz1tolStr(1000000);
    }
    public static String collatzExamples() {
        return collatz1to11to10().concat(collatz1to1000000());
    }
    public static void show(String message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        show(collatzExamples());
    }
}
