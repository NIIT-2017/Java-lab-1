public class Nums {

    private String zero[] = {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "};
    private String one[] = {
            "  *  ",
            " **  ",
            "* *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "*****"};
    private String two[] = {
            " *** ",
            "*   *",
            "   * ",
            "  *  ",
            " *   ",
            "*    ",
            "*****"};
    private String three[] = {
            " *** ",
            "*   *",
            "    *",
            "  ** ",
            "    *",
            "*   *",
            " *** "};
    private String four[] = {
            "   * ",
            "  ** ",
            " * * ",
            "*  * ",
            "*****",
            "   * ",
            "   * "};
    private String five[] = {
            "*****",
            "*    ",
            "*    ",
            "**** ",
            "    *",
            "*   *",
            " *** "};
    private String six[] = {
            "  *  ",
            " *   ",
            "*    ",
            "**** ",
            "*   *",
            "*   *",
            " *** "};
    private String seven[] = {
            "*****",
            "    *",
            "   * ",
            "  *  ",
            " *   ",
            "*    ",
            "*    "};
    private String eight[] = {
            " *** ",
            "*   *",
            "*   *",
            " *** ",
            "*   *",
            "*   *",
            " *** "};
    private String nine[] = {
            " *** ",
            "*   *",
            "*   *",
            " ****",
            "    *",
            "   * ",
            "  *  "};

    public String changer (String in){
        String str[] = in.split("");
        String out = "";
        int buf[] = new int[str.length];

        for (int i=0;i<str.length;i++) {
            buf[i] = Integer.parseInt(str[i]);
        } //парсим массив символов в массив чисел

        for(int i=0; i<7;i++) {
            for (int j = 0; j < buf.length; j++) {
                switch (buf[j]) {
                    case (0):
                        if (j == buf.length - 1) {
                            out += zero[i] + "\n";
                        } else {
                            out += zero[i] + " ";
                        }
                        break;
                    case (1):
                        if (j == buf.length - 1) {
                            out += one[i] + "\n";
                        } else {
                            out += one[i] + " ";
                        }
                        break;
                    case (2):
                        if (j == buf.length - 1) {
                            out += two[i] + "\n";
                        } else {
                            out += two[i] + " ";
                        }
                        break;
                    case (3):
                        if (j == buf.length - 1) {
                            out += three[i] + "\n";
                        } else {
                            out += three[i] + " ";
                        }
                        break;
                    case (4):
                        if (j == buf.length - 1) {
                            out += four[i] + "\n";
                        } else {
                            out += four[i] + " ";
                        }
                        break;
                    case (5):
                        if (j == buf.length - 1) {
                            out += five[i] + "\n";
                        } else {
                            out += five[i] + " ";
                        }
                        break;
                    case (6):
                        if (j == buf.length - 1) {
                            out += six[i] + "\n";
                        } else {
                            out += six[i] + " ";
                        }
                        break;
                    case (7):
                        if (j == buf.length - 1) {
                            out += seven[i] + "\n";
                        } else {
                            out += seven[i] + " ";
                        }
                        break;
                    case (8):
                        if (j == buf.length - 1) {
                            out += eight[i] + "\n";
                        } else {
                            out += eight[i] + " ";
                        }
                        break;
                    case (9):
                        if (j == buf.length - 1) {
                            out += nine[i] + "\n";
                        } else {
                            out += nine[i] + " ";
                        }
                        break;
                }
            }
        }
        return out;
    }
}
