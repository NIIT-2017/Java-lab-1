/* Задача 4. Свертка числовых диапазонов
Написать программу, осуществляющую свертку числовых диапазонов (обратная задача к 3).

Задача 3.
(Написать программу, которая принимает через командную строку несколько числовых диапазонов
и выдает на экран список чисел. Например: ''1,2,4-7,18-21'' -> 1,2,4,5,6,7,18,19,20,21.*/

import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) {
        Task4 Str = new Task4();
        String buf = Str.roll("1,2,3,4,5,10,11,12,13,14,15,20,25,30,31,32,33,34");
        System.out.println(buf);
    }

    String roll(String entStr) {

        String outStr = "";

        String breakStr[] = entStr.split(",");

        int[] allNum = new int[breakStr.length];


        for (int i = 0; i < breakStr.length; i++) {

            allNum[i] = Integer.parseInt(breakStr[i]);
        }

        for (int i = 2; i < allNum.length; i++) {

            if (((allNum[i - 1] - allNum[i - 2]) == 1 && (allNum[i] - allNum[i - 1]) == 1)) {

                int startRange = i - 2;

                for (int j = i - 1; j < allNum.length; j++) {

                    if ((allNum[j] - allNum[j - 1]) != 1) {
                        outStr += Integer.toString(allNum[startRange]);
                        outStr += "-";
                        outStr += Integer.toString(allNum[j - 1]);
                        outStr += ",";
                        break;
                    }

                   else if (j == (allNum.length-1)) {
                        outStr += Integer.toString(allNum[startRange]);
                        outStr += "-";
                        outStr += Integer.toString(allNum[j]);
                        outStr += ".";
                        break;
                    }

                    i++;
                }
            }

            else {
                outStr += Integer.toString(allNum[i - 2]);
                outStr += ",";
            }
        }
        return outStr;
    }
}

