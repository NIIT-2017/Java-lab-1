public class Task2Test {
    public static void main(String[] args)
    {
        double val=0.5;
        Task2 sqrt=new Task2(val);//default precision
        System.out.println("Sqrt of "+val+"="+sqrt.calc());

        sqrt.delta=0.01;// precision 0.01
        System.out.println("Sqrt of "+val+"="+sqrt.calc());
    }
}