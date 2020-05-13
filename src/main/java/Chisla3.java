public class Chisla3 {
    static String[] one = {"    *  ",
                    "   **  ",
                    "    *  ",
                    "    *  ",
                    "    *  ",
                    "    *  ",
                    "   *** "};
    static String[] two = {"  ***  ",
            "*    * ",
            "*   *  ",
            "   *   ",
            "  *    ",
            " *     ",
            " *****"};
    static String[] three = {"  ***  ",
            "*    * ",
            "     * ",
            "   **  ",
            "     * ",
            "*    * ",
            "  ***  "};
    static String[] four = {"    *  ",
            "   **  ",
            "  * *  ",
            " *  *  ",
            " ******",
            "    *  ",
            "    *  "};
    static String[] five = {"  *****",
            "  *    ",
            "  *    ",
            "  **** ",
            "      *",
            " *    *",
            "  **** "};
    static String[] six = {"  **** ",
            " *    *",
            " *     ",
            " ***** ",
            " *    *",
            " *    *",
            "  **** "};
    static String[] seven = {"  *****",
            "      *",
            "     * ",
            "    *  ",
            "   *   ",
            "  *    ",
            "  *    "};
    static String[] eight = {"  ***  ",
            " *   * ",
            " *   * ",
            "  ***  ",
            " *   * ",
            " *   * ",
            "  ***  "};
    static String[] nine = {"  **** ",
            " *   * ",
            " *   * ",
            "  **** ",
            "     * ",
            "     * ",
            "     * "};
    static String[] zero = {"  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "};
    public static String resultString(String a, int i){
        StringBuilder sb = new StringBuilder();

        for(int j=0; j<a.length(); j++) {
            if(a.charAt(j) == '0')
                sb.append(zero[i]);
            if(a.charAt(j) == '1')
                sb.append(one[i]);
            if(a.charAt(j) == '2')
                sb.append(two[i]);
            if(a.charAt(j) == '3')
                sb.append(three[i]);
            if(a.charAt(j) == '4')
                sb.append(four[i]);
            if(a.charAt(j) == '5')
                sb.append(five[i]);
            if(a.charAt(j) == '6')
                sb.append(six[i]);
            if(a.charAt(j) == '7')
                sb.append(seven[i]);
            if(a.charAt(j) == '8')
                sb.append(eight[i]);
            if(a.charAt(j) == '9')
                sb.append(nine[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        for(int i = 0; i<one.length; i++){
            System.out.println(resultString(args[0], i));
        }

    }
}

