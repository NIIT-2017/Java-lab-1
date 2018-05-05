public class DeployRangeDemo
{
    public static void printDeployRange(String string) {
        System.out.print(string + "; ");
        DeployRange.deployRange(string);
    }
    public static void main(String[] args) {
        printDeployRange("1,2,3,5,8,10-11,13-15,18-22,23-28");
    }
}
