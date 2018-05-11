public class Task5 {
    public static void main(String[] args) {
        DrawNumbers myNumbers = new DrawNumbers(args[0]);
        String[] outcomeLine = myNumbers.drawLine();
        for (String i : outcomeLine) {
            System.out.println(i);



        }
    }
}


class DrawNumbers {
    String[] outcomeLine = {"","","","","","",""};
    String line;

    DrawNumbers(String line) {
        this.line = line;
    }

    public String[] drawLine() {
        char[] buf = line.toCharArray();
        int lineLength = buf.length;
        String[] number = outcomeLine;
        for (int i = 0; i < lineLength; i++) {
            number = numberSelection(buf[i]);
            for (int j = 0; j < 7; j++)
                outcomeLine[j] += number[j];
        }
        return outcomeLine;
    }

    String[] numberSelection(char number) {

        switch (number) {
            case '0':
                return new String[]{
                        "*******  ",
                        "*     *  ",
                        "*     *  ",
                        "*     *  ",
                        "*     *  ",
                        "*     *  ",
                        "*******  "
                };

            case '1':
                return new String[]{
                        "    *    ",
                        "   **    ",
                        "  * *    ",
                        " *  *    ",
                        "    *    ",
                        "    *    ",
                        "    *    "
                };

            case '2':
                return new String[]{
                        "*******   ",
                        "*     *   ",
                        "      *   ",
                        "     *    ",
                        "   *      ",
                        " *        ",
                        "*******   "
                };

            case '3':
                return new String[]{
                        " *****   ",
                        "*     *  ",
                        "      *  ",
                        "   **    ",
                        "      *  ",
                        "*     *  ",
                        " *****   "
                };

            case '4':
                return new String[]{
                        "*     *   ",
                        "*     *   ",
                        "*     *   ",
                        "*******   ",
                        "      *   ",
                        "      *   ",
                        "      *   "
                };

            case '5':
                return new String[]{
                        "*******   ",
                        "*         ",
                        "*         ",
                        "*******   ",
                        "      *   ",
                        "      *   ",
                        "*******   "
                };

            case '6':
                return new String[]{
                        "      *   ",
                        "    *     ",
                        " *        ",
                        "*******   ",
                        "*     *   ",
                        "*     *   ",
                        "*******   "
                };

            case '7':
                return new String[]{
                        "*******   ",
                        "      *   ",
                        "      *   ",
                        "      *   ",
                        "    *     ",
                        "  *       ",
                        "*         "
                };

            case '8':
                return new String[]{
                        "*******   ",
                        "*     *   ",
                        "*     *   ",
                        " *****    ",
                        "*     *   ",
                        "*     *   ",
                        "*******   "
                };

            case '9':
                return new String[]{
                        "*******   ",
                        "*     *   ",
                        "*     *   ",
                        "*******   ",
                        "      *   ",
                        "   *      ",
                        "*         "
                };


        }
        return outcomeLine;
    }
}

    /*
    String[] one() {
        String[] one = {
                "   *   ",
                " * *   ",
                "*  *   ",
                "   *   ",
                "   *   ",
                "   *   ",
                "   *   "
        };
        return one;
    }

    String[] two() {
        String[] two = new String[]{
                "*******",
                "*     *",
                "      *",
                "     * ",
                "   *   ",
                " *     ",
                "*******"
        };
        return two;
    }

    String[] three() {
        String[] three;
        three = new String[]{
                " ******",
                " *    *",
                "      *",
                "    ** ",
                "      *",
                " *    *",
                " ******"
        };
        return three;
    }
    String[] four() {
        String[] four = {
                "*     *",
                "*     *",
                "*     *",
                "*******",
                "      *",
                "      *",
                "      *"
        };
        return four;
    } String[] five() {
        String[] five = {
                "*******",
                "*      ",
                "*      ",
                "*******",
                "      *",
                "      *",
                "*******"
        };
        return five;
    } String[] six() {
        String[] six = {
                "      *",
                "    *  ",
                " *     ",
                "*******",
                "*     *",
                "*     *",
                "*******"
        };
        return six;
    }
    String[] seven() {
        String[] seven = {
                "*******",
                "      *",
                "      *",
                "      *",
                "    *  ",
                "  *    ",
                "*      "
        };
        return seven;
    } String[] eight() {
        String[] eight = {
                "*******",
                "*     *",
                "*     *",
                " ***** ",
                "*     *",
                "*     *",
                "*******"
        };
        return eight;
    } String[] nine() {
        String[] nine = {
                "*******",
                "*     *",
                "*     *",
                "*******",
                "      *",
                "   *   ",
                "*     "
        };
        return nine;
    } String[] zero() {
        String[] zero = {
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        };
        return zero;
    }
*/

