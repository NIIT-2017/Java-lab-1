public class SqrtDemo
{
    public static double sqrtMath(double number, int signs) {
        Sqrt sqrt = new Sqrt(number, signs);
        return sqrt.calc();
    }
    public static double[] sqrtDelMath(double number, int signs) {
        Sqrt sqrt = new Sqrt(number, signs);
        double[] results = {sqrt.calc(), sqrt.delta};
        return results;
    }
    public static double[] sqrtDelArgMath(double number, int signs) {
        Sqrt sqrt = new Sqrt(number, signs);
        double[] results = {sqrt.calc(), sqrt.delta, sqrt.getArg()};
        return results;
    }
    public static double sqrtRes2_3() {
        return sqrtMath(2, 3);
    }
    public static double sqrtRes7_15() {
        return sqrtMath(7, 15);
    }
    public static String sqrtStr(double number, int signs) {
        double result = sqrtMath(number, signs);
        return ("Sqrt of " + number + " (" + signs + " signs) = " + String.format("%(."+signs+"f", result) + "." + "\n");
    }
    public static String sqrtDelStr(double number, int signs) {
        double results[] = sqrtDelMath(number, signs);
        return ("Sqrt of " + number + " (delta = " + results[1] + ") = " + String.format("%(."+signs+"f", results[0]) + "." + "\n");
    }
    public static String sqrt2_3() {
        return sqrtStr(2, 3);
    }
    public static String sqrtD2_3() {
        return sqrtDelStr(2, 3);
    }
    public static String sqrt3_5() {
        return sqrtStr(3, 5);
    }
    public static String sqrt7_15() {
        return sqrtStr(7, 15);
    }
    public static String sqrtD11_11() {
        return sqrtDelStr(11, 11);
    }
    public static String sqrtExamples() {
        return sqrt2_3()+sqrtD2_3()+sqrt3_5()+sqrt7_15()+sqrtD11_11();
    }
    public static void show(String message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        show(sqrtExamples());
    }
}
