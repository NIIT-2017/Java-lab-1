public class Task4 {
    public static void main(String[] args){

        if(args.length==0)
            return;

        NumericalRangeMinimize myStr=new NumericalRangeMinimize(args[0]); // передаём значения из командной строки
        myStr.minimize();
    }
}

class NumericalRangeMinimize {
    private String notMinimizeStr;

    NumericalRangeMinimize(String str) {
        notMinimizeStr = str;
    }

    void minimize() {
        boolean firstSymbol = true; //число, полученное из командной строки - самое первое. Иначе-false
        boolean dashOperation = false; /*получаемые из командной строки числа не представляют собой последовательный диапазон.
                                         если начинается последовательный диапазон, переключаем в true */
        int number = 0; //число, полученное из командной строки

        for (String commaSplit : notMinimizeStr.split(",")) {
            if (firstSymbol) {
                System.out.print(commaSplit);
                number = Integer.parseInt(commaSplit);
                firstSymbol = false;
            } else {

                //если начался последовательный диапазон:
                if (Integer.parseInt(commaSplit) - number == 1) {
                    dashOperation = true;
                    number = Integer.parseInt(commaSplit);
                } else {
                    //если последовательный диапазон закончился:
                    if (dashOperation) {
                        System.out.print("-" + number);
                        System.out.print(", " + commaSplit);
                        number = Integer.parseInt(commaSplit);
                        dashOperation = false;
                    }
                    //если последовательного диапазона не было:
                    else {
                        System.out.print(", " + commaSplit);
                        number = Integer.parseInt(commaSplit);
                    }
                }
            }

        }

        //если перебор командной строки заканчивается диапазоном, выведем последнее число диапазона:
        if (dashOperation)
            System.out.print("-" + number);
        // else
        //если перебор командной строки НЕ заканчивается диапазоном
        //возврат на два шага назад для стирания лишних запятой и пробела в конце вывода:
        // System.out.print("\b\b");
    }
}

