public class Task5 {

    public static void main(String[] args) {
        Task5 num = new Task5();
        num.print(args[0]);
    }

        static String[] zero ={"  ***    ", " *   *   ", "*     *  ", "*     *  ", "*     *  ", " *   *   ", "  ***    "};
        static String[] one = {" *   ", "**   ", " *   ", " *   ", " *   ", " *   ", "***  "};
        static String[] two = {" ***   ", "*   *  ", "*  *   ", "  *    ", " *     ", "*      ", "*****  "};
        static String[] three = {" ***   ", "*   *  ", "    *  ", " ***   ", "    *  ", "*   *  ", " ***   "};
        static String[] four = {"   *    ", "  **    ", " * *    ", "*  *    ", "******  ", "   *    ", "   *    "};
        static String[] five = {"*****  ", "*      ", "*      ", " ***   ", "    *  ", "    *  ", " ***   "};
        static String[] six =  {" ***   ", "*      ", "*      ", "****   ", "*   *  ", "*   *  ", " ***   "};
        static String[] seven = {"*****  ", "    *  ", "   *   ", "  *    ", " *     ", "*      ", "*      "};
        static String[] eight = {" ***   ", "*   *  ", "*   *  ", " ***   ", "*   *  ", "*   *  ", " ***   "};
        static String[] nine = {" ****  ", "*   *  ", "*   *  ", " ****  ", "    *  ", "    *  ", "    *  "};

        public static String getOutNum (String arr, int str){

            StringBuilder OutNum = new StringBuilder();

            for (int countStr = 0; countStr < arr.length(); countStr++) {
                if (arr.charAt(countStr) == '0'){
                    OutNum.append (zero[str]);
                }
                if (arr.charAt(countStr) == '1'){
                    OutNum.append (one[str]);
                }
                if (arr.charAt(countStr) == '2'){
                    OutNum.append (two[str]);
                }
                if (arr.charAt(countStr) == '3'){
                    OutNum.append (three[str]);
                }
                if (arr.charAt(countStr) == '4'){
                    OutNum.append (four[str]);
                }
                if (arr.charAt(countStr) == '5'){
                    OutNum.append (five[str]);
                }
                if (arr.charAt(countStr) == '6'){
                    OutNum.append (six[str]);
                }
                if (arr.charAt(countStr) == '7'){
                    OutNum.append (seven[str]);
                }
                if (arr.charAt(countStr) == '8'){
                    OutNum.append (eight[str]);
                }
                if (arr.charAt(countStr) == '9'){
                    OutNum.append (nine[str]);
                }
            }

            String out = OutNum.toString();
            return out;
        }

        void print(String getStr) {
            for (int str = 0; str < zero.length; str++) {
                System.out.println(getOutNum(getStr, str));
            }
        }
}
