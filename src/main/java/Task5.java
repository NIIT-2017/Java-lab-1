public class Task5 {

    public static String table (String num, int dlinna, int stroka){
        StringBuffer strBuffer = new StringBuffer();    //creating string "strBuffer" of class "StringBuffer" for form the final string

        String zero []= {"   ***   ",
                "  *   *  ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *   *  ",
                "   ***   "};

        String one []= {"    *    ",
                "   **    ",
                "    *    ",
                "    *    ",
                "    *    ",
                "    *    ",
                "   ***   "};

        String two [] = {"   ***   ",
                "  *   *  ",
                "  *  *   ",
                "    *    ",
                "   *     ",
                "  *      ",
                "  *****  "};

        String three [] = {"   ***   ",
                "  *   *  ",
                "      *  ",
                "   ***   ",
                "      *  ",
                "      *  ",
                "  ****   "};

        String four [] = {"    *    ",
                "   **    ",
                "  * *    ",
                " *  *    ",
                " ******  ",
                "    *    ",
                "    *    "};

        String five [] = {"  *****  ",
                "  *      ",
                "  *      ",
                "  ****   ",
                "      *  ",
                "      *  ",
                "  ****   "};

        String six [] = {"     *   ",
                "    *    ",
                "   *     ",
                "  *      ",
                "  ****   ",
                " *    *  ",
                "  ****   "};

        String seven [] = {"  *****  ",
                "     *   ",
                "    *    ",
                "   *     ",
                "  *      ",
                "  *      ",
                "  *      "};

        String eight [] = {"   ***   ",
                "  *   *  ",
                "  *   *  ",
                "   ***   ",
                "  *   *  ",
                "  *   *  ",
                "   ***   "};

        String nine [] = {"   ***   ",
                "  *   *  ",
                "  *   *  ",
                "   ****  ",
                "      *  ",
                "     *   ",
                "  ***    "};

        for (int i = 0; i < dlinna; i++){
            switch (num.charAt(i)) {                  //charAt - returns a symbol in the string position [i]
                case '0':
                    strBuffer.append(zero[stroka]);   //the append () method adds a string to the end of a "StringBuffer"
                    break;
                case '1':
                    strBuffer.append(one[stroka]);
                    break;
                case '2':
                    strBuffer.append(two[stroka]);
                    break;
                case '3':
                    strBuffer.append(three[stroka]);
                    break;
                case '4':
                    strBuffer.append(four[stroka]);
                    break;
                case '5':
                    strBuffer.append(five[stroka]);
                    break;
                case '6':
                    strBuffer.append(six[stroka]);
                    break;
                case '7':
                    strBuffer.append(seven[stroka]);
                    break;
                case '8':
                    strBuffer.append(eight[stroka]);
                    break;
                case '9':
                    strBuffer.append(nine[stroka]);
                    break;
            }
        }
        return strBuffer.toString();            //toString() - method to get the string that is keep in "StringBuffer"
    }

    public static void main (String args[]){
        if (args[0].equals('\0'))               //if string args[0] contains '\0'
            return;
        else
            for (int i = 0; i < 7; i++) {
                String line = Task5.table(args[0], args[0].length(), i);
                System.out.println(line);
            }
    }
}