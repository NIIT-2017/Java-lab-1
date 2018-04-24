public class Task5PrintBigNumber {
    public static void main(String[] args) {
        BigNumber object = new BigNumber(args[0]);
        object.setBigNumber(object.inputNumber, object.outputString);
        object.getBigNumber(object.outputString);
    }
}

class BigNumber{
    int height; // высота "больших цифр"
    String inputString[]; // args[0] разбитый на строки из одного символа
    int inputNumber[]; // inputString[] преобразованный в массив чисел
    String outputString[]; // массив выходных строк, в который записываются "цифры" перед выводом на экран


    BigNumber(String argument){
        height = 7;
        inputString = argument.split("");
        inputNumber = stringToNumber(inputString);
        outputString = createOutputString(height);
    }


    int[] stringToNumber(String  inputString[]){
        inputNumber = new int[inputString.length];
        for (int i = 0; i < inputString.length; i++){
            inputNumber[i] = Integer.parseInt(inputString[i]);
        }
        return inputNumber;
    }

    String[] createOutputString(int height){ // создание и инициализация outputString[]
        String outputString[] = new String[height];
        for (int i = 0; i < height; i++)
            outputString[i] = "";

        return outputString;
    }

    void setBigNumber(int inputNumber[], String outputString[]){ // заполнение массива строк outputString в соответствии со значениями в inputNumber[]
        for (int num:
             inputNumber) {
            switch (num){

                case 0:
                    outputString[0] += "  ***  ";
                    outputString[1] += " *   * ";
                    outputString[2] += "*     *";
                    outputString[3] += "*     *";
                    outputString[4] += "*     *";
                    outputString[5] += " *   * ";
                    outputString[6] += "  ***  ";
                    break;

                case 1:
                    outputString[0] += "   *   ";
                    outputString[1] += " * *   ";
                    outputString[2] += "   *   ";
                    outputString[3] += "   *   ";
                    outputString[4] += "   *   ";
                    outputString[5] += "   *   ";
                    outputString[6] += "  ***  ";
                    break;

                case 2:
                    outputString[0] += "  ***  ";
                    outputString[1] += " *   * ";
                    outputString[2] += "     * ";
                    outputString[3] += "    *  ";
                    outputString[4] += "   *   ";
                    outputString[5] += "  *    ";
                    outputString[6] += " ***** ";
                    break;

                case 3:
                    outputString[0] += "  ***  ";
                    outputString[1] += " *   * ";
                    outputString[2] += "     * ";
                    outputString[3] += "   **  ";
                    outputString[4] += "     * ";
                    outputString[5] += " *   * ";
                    outputString[6] += "  ***  ";
                    break;

                case 4:
                    outputString[0] += " *   * ";
                    outputString[1] += " *   * ";
                    outputString[2] += " *   * ";
                    outputString[3] += " ***** ";
                    outputString[4] += "     * ";
                    outputString[5] += "     * ";
                    outputString[6] += "     * ";
                    break;

                case 5:
                    outputString[0] += " ****  ";
                    outputString[1] += " *     ";
                    outputString[2] += " *     ";
                    outputString[3] += "  ***  ";
                    outputString[4] += "     * ";
                    outputString[5] += " *   * ";
                    outputString[6] += "  ***  ";
                    break;

                case 6:
                    outputString[0] += "  ***  ";
                    outputString[1] += " *   * ";
                    outputString[2] += " *     ";
                    outputString[3] += " ****  ";
                    outputString[4] += " *   * ";
                    outputString[5] += " *   * ";
                    outputString[6] += "  ***  ";
                    break;

                case 7:
                    outputString[0] += "*******";
                    outputString[1] += "     * ";
                    outputString[2] += "    *  ";
                    outputString[3] += "  ***  ";
                    outputString[4] += "  *    ";
                    outputString[5] += "  *    ";
                    outputString[6] += "  *    ";
                    break;

                case 8:
                    outputString[0] += "  ***  ";
                    outputString[1] += " *   * ";
                    outputString[2] += " *   * ";
                    outputString[3] += "  ***  ";
                    outputString[4] += " *   * ";
                    outputString[5] += " *   * ";
                    outputString[6] += "  ***  ";
                    break;

                case 9:
                    outputString[0] += "  ***  ";
                    outputString[1] += " *   * ";
                    outputString[2] += " *   * ";
                    outputString[3] += "  **** ";
                    outputString[4] += "     * ";
                    outputString[5] += " *   * ";
                    outputString[6] += "  ***  ";
                    break;
            }
        }
    }

    void getBigNumber(String outputString[]){ // печать значений массива строк outputString на экран


        for (String line:
             outputString) {
            //System.out.println(line); // println генерирует CRLF, поэтому заменён на print + \n
            System.out.print(line + "\n");
        }
    }

}