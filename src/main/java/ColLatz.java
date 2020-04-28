public class ColLatz {
    public static int collatc (long step) { //Метод расчёта полседовательности
        if (step == 1) {
            return 1;
        } else if (step % 2 == 0) { //проверка четного, нечетного числа
            return 1 + collatc(step / 2); //вычисление последовательности для чётного числа
        } else {
            return 1 + collatc(step * 3 + 1); //вычисление последовательности для нечетного числа
        }
    }
    public static void main (String[] args) {
        long i, step = 1; //задаём переменные счётчкка, числа и количества дейсвий
        long num = 0, number = 0; //переменные каждого числа в последоваетльности и перменная числа с наибольше последовательностью
        for (i = 1; i <= 1000000; i++) {
            num = collatc(i);
            if (num > number) {
                number = num;
                step = i;
            }
        }
        System.out.println("Число с наибольшей последовательностью - " + step);
        System.out.println("Линнна последовательности - " + number);
    }
}

