public class Task3 {
    public static void main(String[] args){

        if(args.length==0)
            return;

        NumericalRangeSweep myStr=new NumericalRangeSweep(args[0]); // передаём значения из командной строки
        myStr.sweep();
    }
}

class NumericalRangeSweep {
    private String notSweepStr;

    NumericalRangeSweep(String str) {
        notSweepStr = str;
        //notSweepStr = str.trim(); //.trim удаляет пробелы в начале и конце строки
    }

    void sweep() {
        boolean firstSymbol = true; //число, полученное из командной строки - самое первое. Иначе-false
        for (String commaSplit : notSweepStr.split(",")) {

            // indexOf возвращает индекс искомого символа. Если символ не найден, indexOf возвращает -1.
            // int indexM = commaSplit.indexOf("-");

            // contains проверяет, содержит ли строка commaSplit символ или последовательность символов, указанную в кавычках
            if (commaSplit.contains("-")) {

                /*
                //возвращает подстроку строки commaSplit, начиная и заканчивая символами с указанными индексами:
                //при этом: начальный индекс-включительно, конечный индекс-НЕ включая:
                int beginDash = Integer.parseInt(commaSplit.substring(0, commaSplit.indexOf("-")));
                //возвращает подстроку строки commaSplit, начиная с символа с указанным индексом и заканчивая концом строки:
                int endDash = Integer.parseInt(commaSplit.substring(commaSplit.indexOf("-")+1));
                */

                String[] StrDash = commaSplit.split("-");
                int beginDash = Integer.parseInt(StrDash[0]);
                int endDash = Integer.parseInt(StrDash[1]);


                for (int j = beginDash; j <= endDash; j++) {
                    if(firstSymbol) {
                        System.out.print(j);
                        firstSymbol = false;
                    }
                    else
                    System.out.print(", " + j);
                }
            } else {
                if(firstSymbol) {
                    System.out.print(commaSplit);
                    firstSymbol = false;
                }
                else
                System.out.print(", " + commaSplit);
            }
        }

        //возврат на два шага назад для стирания лишних запятой и пробела в конце вывода:
        //System.out.print("\b\b");

    }
}
