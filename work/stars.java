//Задача 5. Вывод числа символами
class stars {
    public static String[] NumToStars(int x){ //возвращает массив строк из звездочек
        switch (x) {
            case 0:
                String[] str0 = {"  ***  ", " *   * ", "*     *", "*     *", "*     *", " *   * ", "  ***  "};
                return str0;
            case 1:
                String[] str1 = {"   *   ", "  **   ", "   *   ", "   *   ", "   *   ", "   *   ", "  ***  "};
                return str1;
            case 2:
                String[] str2 = {"  ***  ", " *   * ", " *  *  ", "   *   ", "  *    ", " *     ", " ***** "};
                return str2;
            case 3:
                String[] str3 = {"  ***  ", " *   * ", "     * ", "  ***  ", "     * ", " *   * ", "  ***  "};
                return str3;
            case 4:
                String[] str4 = {"    *  ", "   **  ", "  * *  ", " *  *  ", "****** ", "    *  ", "    *  "};
                return str4;
            case 5:
                String[] str5 = {" ***** ", " *     ", " *     ", " ****  ", "     * ", " *   * ", "  ***  "};
                return str5;
            case 6:
                String[] str6 = {"  ***  ", " *   * ", " *     ", " ****  ", " *   * ", " *   * ", "  ***  "};
                return str6;
            case 7:
                String[] str7 = {" ***** ", "     * ", "    *  ", "   *   ", "  *    ", " *     ", " *     "};
                return str7;
            case 8:
                String[] str8 = {"  ***  ", " *   * ", " *   * ", "  ***  ", " *   * ", " *   * ", "  ***  "};
                return str8;
            case 9:
                String[] str9 = {"  ***  ", " *   * ", " *   * ", "  **** ", "     * ", " *   * ", "  ***  "};
                return str9;
            default:
                String[] strd = {"*******", " ***** ", "  ***  ", "       ", "   *   ", "  ***  ", "   *   "};
                return strd;
        }

        }

    public static void main(String[] args){
        String str=args[0];
        char[] charNum=str.toCharArray();
        for (int y=0; y<7; y++){
            String result="";
            for(int x=0; x<charNum.length; x++) {
                result=result.concat(NumToStars(Character.getNumericValue(charNum[x]))[y]);//построчно объединяет звездочки
            }
            System.out.println(result);
        }

    }
}
