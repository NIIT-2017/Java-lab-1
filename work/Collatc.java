//Задача 1. Последовательность Коллатца
class Colattc {
    public static long SeqLen(int a) { //возвращает длину последовательности
        long b = (long) a;
        long n = 1;
        while (b != 1) {
            if (b % 2 == 0) {
                b = b / 2;
            } else {
                b = 3 * b + 1;
            }
            n++;
        }
        return n;
    }
}

class MyClass {
    public static void main(String[] args) {
        int MaxNum = 1000000;
        long sLen = 0;
        int num = 0;
        for (int x = 1; x <= MaxNum; x++) {
            if (Colattc.SeqLen(x) > sLen) {
                sLen = Colattc.SeqLen(x);
                num = x;
            }
        }
        System.out.println("Длина наибольшей последовательности=" + sLen + "\nСтартовое число этой последовательности=" + num);
    }

}
