package num_to_star;

public class NumToStar {

    private String[] line = new String[7];

    {
        for (int i = 0; i<7; i++)
            line[i] = "";
    }

    private static int[] parseArgs(String[] args){
        String[] arrStr = args[0].split("");
        int[] arrNum = new int[arrStr.length];
        for (int i = 0; i<arrStr.length; i++){
            try {
                arrNum[i] = Integer.parseInt(arrStr[i]);
            }catch (NumberFormatException nfe){
                System.err.println("Введены неверные символы!\n Введите целые числа подряд без пробелов.\n Например: [12345]");
            }
        }
        return arrNum;
    }

    public void writeNum(String[] args){

        int[] arrNum = parseArgs(args);

        StringBuilder[] lines = new StringBuilder[7];
        for (int i = 0; i<7; i++)
            lines[i] = new StringBuilder();

        for (int i=0; i<arrNum.length; i++){
            switch (arrNum[i]) {
                case 1:
                    writeOne();
                    break;
                case 2:
                    writeTwo();
                    break;
                case 3:
                    writeThree();
                    break;
                case 4:
                    writeFour();
                    break;
                case 5:
                    writeFive();
                    break;
                case 6:
                    writeSix();
                    break;
                case 7:
                    writeSeven();
                    break;
                case 8:
                    writeEight();
                    break;
                case 9:
                    writeNine();
                    break;
                case 0:
                    writeNull();
                    break;
            }
            for (int j = 0; j<7; j++)
                lines[j].append(line[j]);
        }
        for (StringBuilder sb: lines)
            System.out.println(sb);

    }

    private void writeOne(){
        line[0] = "   *   ";
        line[1] = "  **   ";
        line[2] = "   *   ";
        line[3] = "   *   ";
        line[4] = "   *   ";
        line[5] = "   *   ";
        line[6] = "  ***  ";
    }

    private void writeTwo(){
        line[0] = "  ***  ";
        line[1] = " *   * ";
        line[2] = " *  *  ";
        line[3] = "   *   ";
        line[4] = "  *    ";
        line[5] = " *     ";
        line[6] = " ***** ";
    }

    private void writeThree(){
        line[0] = "  ***  ";
        line[1] = " *   * ";
        line[2] = "     * ";
        line[3] = "  ***  ";
        line[4] = "     * ";
        line[5] = " *   * ";
        line[6] = "  ***  ";
    }

    private void writeFour(){
        line[0] = "      *  ";
        line[1] = "     **  ";
        line[2] = "    * *  ";
        line[3] = "   *  *  ";
        line[4] = "  *******";
        line[5] = "      *  ";
        line[6] = "      *  ";
    }

    private void writeFive(){
        line[0] = " ***** ";
        line[1] = " *     ";
        line[2] = " *     ";
        line[3] = " ****  ";
        line[4] = "     * ";
        line[5] = " *   * ";
        line[6] = "  ***  ";
    }

    private void writeSix(){
        line[0] = "  ***  ";
        line[1] = " *   * ";
        line[2] = " *     ";
        line[3] = " ****  ";
        line[4] = " *   * ";
        line[5] = " *   * ";
        line[6] = "  ***  ";
    }

    private void writeSeven(){
        line[0] = "  *****";
        line[1] = "     * ";
        line[2] = "    *  ";
        line[3] = "   *   ";
        line[4] = "  *    ";
        line[5] = "  *    ";
        line[6] = "  *    ";
    }

    private void writeEight(){
        line[0] = "  ***  ";
        line[1] = " *   * ";
        line[2] = " *   * ";
        line[3] = "  ***  ";
        line[4] = " *   * ";
        line[5] = " *   * ";
        line[6] = "  ***  ";
    }

    private void writeNine(){
        line[0] = "  ***  ";
        line[1] = " *   * ";
        line[2] = " *   * ";
        line[3] = "  **** ";
        line[4] = "     * ";
        line[5] = "     * ";
        line[6] = "     * ";
    }

    private  void writeNull(){
        line[0] = "  ***  ";
        line[1] = " *   * ";
        line[2] = " *   * ";
        line[3] = " *   * ";
        line[4] = " *   * ";
        line[5] = " *   * ";
        line[6] = "  ***  ";
    }

    public static void main(String[] args){

        NumToStar numToStar = new NumToStar();

        numToStar.writeNum(args);
    }
}
