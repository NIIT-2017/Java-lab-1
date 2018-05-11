/*Найти наибольшую последовательность Коллатца для чисел в диапазоне от 1 до 1 000 000. */
class Collatz {
    long numberB;
    long seqLength; // длина последовательности для исходного числа numberA
    int maxNumber; // максимальное число, для которого вычисляем длину последовательности
    long maxSeqLength;  // длина наибольшей последовательности для чисел из диапазона
    int firstNumberOfMaxSeqLength;  // начальное число для наибольшей длины последовательности

    Collatz() {
        maxSeqLength = 0;
        firstNumberOfMaxSeqLength = 0;
    }

    // данный метод возвращает длину последовательности
    long sequenceLength(int numberA) {
        numberB = (long) numberA; // длина последовательности для исходного числа numberA
        seqLength = 1;
        while (numberB != 1) {  // если число numberB не единица (не стало единицей), прогоняем цикл

            // если число чётное
            if (numberB % 2 == 0) {
                numberB /= 2;
            }

            // если число нечётное
            else {
                numberB = 3 * numberB + 1;
            }
            seqLength++;  //прибавляем 1 к длине последовательности и идём проверять, не стало ли число numberB единицей
        }
       return seqLength;  //если число numberB единица (стало единицей), возвращаем длину последовательности
    }

    void sequenceCalculation(int num) {
        maxNumber = num; // максимальное число, для которого вычисляем длину последовательности

        for (int i = 1; i <= maxNumber; i++) {
            if (sequenceLength(i) > maxSeqLength) {
                maxSeqLength = sequenceLength(i);
                firstNumberOfMaxSeqLength = i;
            }
        }
    }
}


public class Task1 {
    public static void main(String[] args) {
        Collatz myCollatz = new Collatz();
        myCollatz.sequenceCalculation(27);

        System.out.println("Длина наибольшей последовательности для чисел в диапазоне от 1 до 1 000 000 равна: " + myCollatz.maxSeqLength);
        System.out.println("Начальное число в этой последовательности: " + myCollatz.firstNumberOfMaxSeqLength);
    }
}

