public class task5 {
    private static String[] result = new String[7];

    public static void main(String[] args) {
        char[] symbols = args[0].toCharArray();

        for(int i=0; i < result.length; i++)
            result[i]="";

        Numerals numerals = new Numerals();
        
        for (char symbol:symbols
             ) {
            switch (symbol){
                case '0': UpdateResult(numerals.num0);break;
                case '1': UpdateResult(numerals.num1);break;
                case '2': UpdateResult(numerals.num2);break;
                case '3': UpdateResult(numerals.num3);break;
                case '4': UpdateResult(numerals.num4);break;
                case '5': UpdateResult(numerals.num5);break;
                case '6': UpdateResult(numerals.num6);break;
                case '7': UpdateResult(numerals.num7);break;
                case '8': UpdateResult(numerals.num8);break;
                case '9': UpdateResult(numerals.num9);break;
                default:{
                    System.out.println("Error: only numbers can be specified!");
                    return;
                }
            }
        }
        for (String line:result
             ) {
            System.out.println(line);
        }
    }
    private static void UpdateResult(String[] lines){
        for (int i = 0; i < result.length; i++)
            result[i] += lines[i] + " ";

    }
}
class Numerals{
    String[] num0 = {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
    };
    String[] num1 = {
            " * ",
            "** ",
            " * ",
            " * ",
            " * ",
            " * ",
            "***"
    };
    String[] num2 = {
            " *** ",
            "*   *",
            "*  * ",
            "  *  ",
            " *   ",
            "*    ",
            "*****"
    };
    String[] num3 = {
            " *** ",
            "*   *",
            "    *",
            "  ** ",
            "    *",
            "*   *",
            " *** "
    };
    String[] num4 = {
            "   *  ",
            "  **  ",
            " * *  ",
            "*  *  ",
            "******",
            "   *  ",
            "   *  "
    };
    String[] num5 = {
            "*****",
            "*    ",
            "*    ",
            "**** ",
            "    *",
            "    *",
            "**** "
    };
    String[] num6 = {
            " *** ",
            "*    ",
            "*    ",
            "**** ",
            "*   *",
            "*   *",
            " *** "
    };
    String[] num7 = {
            "*****",
            "    *",
            "   * ",
            "  *  ",
            " *   ",
            "*    ",
            "*    "
    };
    String[] num8 = {
            " *** ",
            "*   *",
            "*   *",
            " *** ",
            "*   *",
            "*   *",
            " *** "
    };
    String[] num9 = {
            " ****",
            "*   *",
            "*   *",
            " ****",
            "    *",
            "    *",
            "    *"
    };
}