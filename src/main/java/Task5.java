public class Task5 {
    static int sizeArr=13;

    static String[] seeNumber(String numbers){
    String[] numberPicture={"","","","","","","","","","","","",""};
    final String[] zero={" ***  ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", " ***  "};
    final String[] one={"  *   ", "  *   ", "  *   ", "  *   ", "  *   ", "  *   ", "  *   ", "  *   ", "  *   ", "  *   ", "  *   ", "  *   ", "***** "};
    final String[] two={" ***  ", " * *  ", "*   * ", "*   * ", "*   * ", "      ", "   *  ", "      ", "  *   ", "      ", " *    ", "      ", "***** "};
    final String[] three={"  **  ", " *  * ", " *  * ", "    * ", "    * ", "   *  ", "  *   ", "   *  ", "    * ", "    * ", " *  * ", " *  * ", "  **  "};
    final String[] four={"    * ", "    * ", "   ** ", "    * ", "  * * ", "    * ", " *  * ", "    * ", "******", "    * ", "    * ", "    * ", "    * "};
    final String[] five={" **** ", " *    ", " *    ", " *    ", " *    ", " *    ", " ***  ", "    * ", "    * ", "    * ", "*   * ", "*   * ", " ***  "};
    final String[] six={"   *  ", "   *  ", "  *   ", " *    ", "*     ", "*     ", "***** ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", "***** "};
    final String[] seven={"****  ", "   *  ", "   *  ", "   *  ", "   *  ", "  *   ", " *    ", "*     ", "*     ", "*     ", "*     ", "*     ", "*     "};
    final String[] eight={" ***  ", "*   * ", "*   * ", "*   * ", "*   * ", " ***  ", " ***  ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", " ***  "};
    final String[] nine={" **** ", " *  * ", "*   * ", "*   * ", "*   * ", "*   * ", "***** ", "    * ", "    * ", "    * ", "    * ", "    * ", " **** "};

    char[] numberArray=numbers.toCharArray();
    for(int i=0;i<sizeArr;i++){
        for(char c : numberArray){
            switch (c){
                case '0':
                    numberPicture[i]=numberPicture[i].concat(zero[i]);
                    break;
                case '1':
                    numberPicture[i]=numberPicture[i].concat(one[i]);
                    break;
                case '2':
                    numberPicture[i]=numberPicture[i].concat(two[i]);
                    break;
                case '3':
                    numberPicture[i]=numberPicture[i].concat(three[i]);
                    break;
                case '4':
                    numberPicture[i]=numberPicture[i].concat(four[i]);
                    break;
                case '5':
                    numberPicture[i]=numberPicture[i].concat(five[i]);
                    break;
                case '6':
                    numberPicture[i]=numberPicture[i].concat(six[i]);
                    break;
                case '7':
                    numberPicture[i]=numberPicture[i].concat(seven[i]);
                    break;
                case '8':
                    numberPicture[i]=numberPicture[i].concat(eight[i]);
                    break;
                case '9':
                    numberPicture[i]=numberPicture[i].concat(nine[i]);
                    break;
            }
        }
    }
    return numberPicture;

}
    public static void main(String[] args) {
        String numbers=args[0];
        String[] numberPicture = seeNumber(numbers);
        for (int i=0;i<sizeArr;i++)
            System.out.println(numberPicture[i]);
    }
}
