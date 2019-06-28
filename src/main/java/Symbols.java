public class Symbols {

    String zero[] = {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
    };

    String one[] = {
            "  *  ",
            " **  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            " *** "
    };

    String two[] = {
            "  ***  ",
            " *   * ",
            " *  *  ",
            "   *   ",
            "  *    ",
            " *     ",
            " ***** "
    };

    String three[] = {
            "  **  ",
            " *  * ",
            "    * ",
            "  **  ",
            "    * ",
            " *  * ",
            "  **  "
    };

    String four[] = {
            "    * ",
            "   ** ",
            "  * * ",
            " *  * ",
            " **** ",
            "    * ",
            "    * "
    };

    String five[] = {
            " ***** ",
            " *     ",
            " ****  ",
            "     * ",
            "     * ",
            " *   * ",
            "  ***  "
    };

    String six[] = {
            "    * ",
            "   *  ",
            "  *   ",
            " ***  ",
            " *  * ",
            " *  * ",
            " ***  "
    };

    String seven[] = {
            " ***** ",
            "     * ",
            "    *  ",
            "   *   ",
            "  *    ",
            " *     ",
            " *     "
    };

    String eight[] = {
            "  ***  ",
            " *   * ",
            " *   * ",
            "  ***  ",
            " *   * ",
            " *   * ",
            "  ***  "
    };

    String nine[] = {
            "  *** ",
            " *  * ",
            " *  * ",
            "  *** ",
            "   *  ",
            "  *   ",
            " *    "
    };

    static  String [] picture= new String[7];
    static{
        for(int i=0; i < picture.length; i++)
            picture[i]="";
    }


    void createPicture(String[] line){
        for (int i = 0; i < picture.length; i++)
            picture[i] += line[i] + " ";
    }

    void choiceNumber(char [] str) {

        for (char symbol : str) {
            switch (symbol) {
                case '0':
                    createPicture(zero);
                    break;
                case '1':
                    createPicture(one);
                    break;
                case '2':
                    createPicture(two);
                    break;
                case '3':
                    createPicture(three);
                    break;
                case '4':
                    createPicture(four);
                    break;
                case '5':
                    createPicture(five);
                    break;
                case '6':
                    createPicture(six);
                    break;
                case '7':
                    createPicture(seven);
                    break;
                case '8':
                    createPicture(eight);
                    break;
                case '9':
                    createPicture(nine);
                    break;
                default: {
                    System.out.println("Error: this is not a number!");
                    return;
                }
            }
        }
    }
}
