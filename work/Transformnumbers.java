//Лабораторный практикум№1 Задача№5 Вывод числап символами
//Выполнил Ефремов Павел

import static java.lang.Character.digit;

public class Transformnumbers {
    public static void main (String args[]){

        short height = 7;    //высота цифры

        char str[] = args[0].toCharArray();             //разбитие входной строки на символы
        int number[] = new int[str.length];

        for(int i = 0; i < str.length; i++) {           //перевод символов в цифры
            number[i] = digit(str[i], 10);
        }

        String strnumber[] = new String[height]  ;      //массив финальных строк
        for (int i = 0; i < height; i++){               //зануляем его
            strnumber[i] = "";
        }

        for(int i = 0; i < height; i++) {
            for (int j = 0; j < number.length; j++){
               strnumber[i] = strnumber[i] + "  " + Transform.transstr(i,number[j]);        //i номер строки, j число, которое рисуется
            }
            System.out.println(strnumber[i]);
        }
    }
}
