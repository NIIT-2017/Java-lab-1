public class TaskStrToInt {
    public static void main(String[] args) {
        String input = "1-5,8,11-13,15-17";
        StrToInt open = new StrToInt();
        int[] totalArr = open.StrToInt(input);

        for (int i = 0; i < (totalArr.length - 1); i++) {
            System.out.print(totalArr[i] + ",");
        }
        System.out.println(totalArr[totalArr.length - 1]);
    }
}
