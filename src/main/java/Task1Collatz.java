public class Task1Collatz
{

    public static void main (String[] args){
        long startNumberCollatz = 1; // начальный элемент последовательности
        long endNumberCollatz = 1000000; // конечный элемент последовательности
        Collatz Conjecture = new Collatz(startNumberCollatz, endNumberCollatz);
        Conjecture.maxLength = Conjecture.getLength(startNumberCollatz, endNumberCollatz);
        System.out.print("Максимальная длинна последовательности в диапазоне от " +startNumberCollatz+ " до " +endNumberCollatz+ ": "
                + Conjecture.maxLength + ", при начальном числе " + Conjecture.maxNumber);
    }


}

class Collatz
{
    long startNumber;
    long endNumber;
    long maxNumber; // начальный элемент с максимальной последовательностью
    long maxLength; // количество элементов в максимальной последовательности

    Collatz(long startNumberCollatz, long endNumberCollatz){
        startNumber = startNumberCollatz;
        endNumber = endNumberCollatz;
        maxNumber = 0L;
        maxLength = 0L;
    }

    public long getCollatz(long number) { // алгоритм последовательности Коллатца
        long count = 0; // !!!
        while (number != 1) {
            if (number % 2 == 0)
                number = (number / 2);
            else // нечётное
                number = (3 * number + 1);
            count++;
        }
        return count;
    }

     public long getLength(long startNumber, long endNumber) {
         long number = startNumber; // первый элемент последовательности

         long length = 0; // счётчик элементов последовательности
         long maxLen = 0; // максимальная длинна последовательности

         for (; number <= endNumber; number++) { // перебор "первых" элементов
             length = getCollatz(number);

             if (maxLen <= length) { // запись максимальных значений
                 //maxLength = length;
                 maxLen = length;
                 maxNumber = number;
             }
         }
         return maxLen;
     }
}