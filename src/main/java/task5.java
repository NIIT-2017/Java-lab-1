public class task5 {
    public static String [] zero =
            {
                    "  ***  ",
                    " *   * ",
                    "*     *",
                    "*     *",
                    "*     *",
                    " *   * ",
                    "  ***  ",
            };
    public static String [] one=
            {
                    " * ",
                    "** ",
                    " * ",
                    " * ",
                    " * ",
                    " * ",
                    "***",
            };
    public static String [] two=
            {
                    " *** ",
                    "*   *",
                    "*  * ",
                    "  *  ",
                    " *   ",
                    "*    ",
                    "*****",
            };
    public static String [] three=
            {
                    " *** ",
                    "*   *",
                    "   * ",
                    " *** ",
                    "   * ",
                    "*   *",
                    " *** ",
            };
    public static String [] four=
            {
                    "   * ",
                    "  ** ",
                    " * * ",
                    "*  * ",
                    "*****",
                    "   * ",
                    "   * ",
            };
    public static String [] five=
            {
                    " ****",
                    "*    ",
                    "*    ",
                    " *** ",
                    "   * ",
                    "*   *",
                    " *** ",
            };
    public static String [] six=
            {
                    " *** ",
                    "*   *",
                    "*    ",
                    " *** ",
                    "*   *",
                    "*   *",
                    " *** ",
            };
    public static String [] seven=
            {
                    "*****",
                    "   * ",
                    "  *  ",
                    " *   ",
                    "*    ",
                    "*    ",
                    "*    ",
            };
    public static String []  eight=
            {
                    " *** ",
                    "*   *",
                    " * * ",
                    " *** ",
                    " * * ",
                    "*   *",
                    " *** ",
            };
    public static String []  nine=
            {
                    " ****",
                    "*   *",
                    "*   *",
                    " ****",
                    "    *",
                    "    *",
                    "    *",
            };
    public static String numberDrawing (String number, int j)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++)
        {
            if (number.charAt(i) == '0')
                sb.append(zero[j]);
            if (number.charAt(i) == '1')
                sb.append(one[j]);
            if (number.charAt(i) == '2')
                sb.append(two[j]);
            if (number.charAt(i) == '3')
                sb.append(three[j]);
            if (number.charAt(i) == '4')
                sb.append(four[j]);
            if (number.charAt(i) == '5')
                sb.append(five[j]);
            if (number.charAt(i) == '6')
                sb.append(six[j]);
            if (number.charAt(i) == '7')
                sb.append(seven[j]);
            if (number.charAt(i) == '8')
                sb.append(eight[j]);
            if (number.charAt(i) == '9')
                sb.append(nine[j]);
        }
        return sb.toString();
    }
    public static void main (String[] args)
    {
        for(int j = 0; j < zero.length; j++)
            System.out.println(numberDrawing(args[0], j));

    }
}
