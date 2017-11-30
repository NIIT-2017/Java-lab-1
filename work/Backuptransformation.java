//Лаба№4 Свертка числовых диапазонов 1,2,4,5,6,7,18,19,20,21. -> ''1,2,4-7,18-21''
//Выполнил ЕФремов Павел

//1,2,4,5,6,7,18,19,20,21. -> ''1,2,4-7,18-21''

public class Backuptransformation {
    public static void main(String args[]){

        int count = 1;                                        //счетчик чисел, идущих попорядку
        StringBuffer result = new StringBuffer();            //буфер финальной строки

        String strnumbers[] = args[0].split(",");      // разбил строку по элементу "," на массив строк
        int final_array[] = new int[strnumbers.length+1];    //финальный массив чисел
        final_array[final_array.length-1] = 0;               // добавляем фиктивный последний елемент = 0, признак конца массива

        for(int i = 0; i < final_array.length-1; i++) {                   //Начинаем преобразовывать строки в числа
            try {
                final_array[i] = Integer.valueOf(strnumbers[i]);      //преобразовываем полученые строки в числа
            } catch (NumberFormatException e)                       //отлов исключения на предмет неправильного ввода
            {
                System.out.println("Неферный формат строки");
                return;
            }
         }

        for (int i = 0; i < final_array.length-1; i++ ){    //перебор массива чисел
            if(final_array[i+1] - final_array[i] == 1) {    //ищем числа идещие попорядку
                count = count + 1;
                if(count <= 2)
                    if (result.length() == 0)result.append(final_array[i]); //проверка пустой ли буфер
                    else result.append(",").append(final_array[i]);
            }
            else {
                if(count <= 2)                  //если чисел, идущих попорядку, всего два - выводим чрез ","
                    result.append(",").append(final_array[i]);
                else  result.append("-").append(final_array[i]);    //иначе через "-"
                count = 1;                                              //обнулили счетчик
            }
        }
        System.out.print(result);   //вывод финальной последовательности.
    }
}
