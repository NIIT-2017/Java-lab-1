public class DeployRangeDemo
{
    public static String[] strArr(String string) {
        return DeployRange.strArrRes(string);
    }
    public static String str(String string) {
        return DeployRange.strRes(string);
    }
    public static String build(String string) {
        return string + "\n" + str(string) +"\n\n";
    }
    public static String ex1() {
        return build("1-24");
    }
    public static String ex2() {
        return build("1-10,12-23");
    }
    public static String ex3() {
        return build("1,2,4,7,11-12,14-16,19-22");
    }
    public static String ex4() {
        return build("1,3-4,7,9,13-15,20,21-23");
    }
    public static String ex5() {
        return build("1,2,3,5,8,10-11,13-15,18-22,23-28");
    }
    public static String examples() {
        return ex1()+ex2()+ex3()+ex4()+ex5();
    }
    public static void show(String message) {
        System.out.print(message);
    }
    public static void main(String[] args) {
        show(examples());
    }
}
