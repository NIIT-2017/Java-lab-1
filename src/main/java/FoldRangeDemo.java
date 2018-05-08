public class FoldRangeDemo
{
    public static String str(String string) {
        return FoldRange.strRes(string);
    }
    public static String build(String string) {
        return string + "\n" + str(string) +"\n\n";
    }
    public static String ex1() {
        return build("1,3,6,7,9,11,12,13,16,18,20,21,22,23,24");
    }
    public static String ex2() {
        return build("1,2,3,5,6,7,8,11,12,13,14,15,16,17,18");
    }
    public static String ex3() {
        return build("1,2,4,7,11,12,14,15,16,19,20,21,22");
    }
    public static String ex4() {
        return build("1,3,4,7,9,13,14,15,20,21,22");
    }
    public static String ex5() {
        return build("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16");
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
