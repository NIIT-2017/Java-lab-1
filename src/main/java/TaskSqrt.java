public class TaskSqrt {
    public static void main(String[] args) {
        double val = 32;
        double delta = 0.00001;
        Sqrt sqrt = new Sqrt(val, delta);
        double result = sqrt.calc();
        System.out.println("Sqrt of " + val + "=" + result);
    }
}
