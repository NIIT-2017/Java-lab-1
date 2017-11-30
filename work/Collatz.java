//Задача№1 последовательность коллаца
//Выполнил Ефремов Павел


    public class Collatz {

        public static void main(String[] args) {

            int      N = 1000000;
            long     maxlenght = 1;                 //max длинна последовательности чисел от 1 до 1 000 000
            long     temp = 0;                      //временная переменная для хранения текущей длинны последовательности
            long     numbermaxlenght = 1;           //число с максимальной последовательностью

            for (long i = 1; i <= N; i++) {
                temp = Calculation(i);
                if (temp > maxlenght) {
                    maxlenght = temp;
                    numbermaxlenght = i;
                }
            }
            System.out.println("Максимальная длинна последовательности чисел от 1 до " + N + ": " + maxlenght);
            System.out.println("Число с максимальной последовательностью Коллатца: " + numbermaxlenght);
            System.out.println();
        }

        private static long Calculation (long n) {

            long     curentlenght = 1;              //текущая длинна последовательности

            while (n!=1) {                          //цикл выполнения алгоритма Коллатца
                curentlenght++;
                if (n % 2 == 0) n = n/2;
                else n = n*3+1;
            }
            return curentlenght;
        }
    }

