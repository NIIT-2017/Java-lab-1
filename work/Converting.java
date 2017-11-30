//Лаборатолрный практикум №1 задача №3 развертка числовых диапазонов.
//Выполнил Ефремов Павел

//Например: ''1,2,4-7,18-21'' -> 1,2,4,5,6,7,18,19,20,21.

public class Converting {
    public static void main(String[] args){

        boolean acept;                                                //флажок для поиска строки типа 4-7
        String strnumbers[] = args[0].split(",");               // разбил строку по элементу "," на массив строк
        int final_array[] = new int[strnumbers.length];               //финальный массив чисел

        for(int i = 0; i < strnumbers.length; i++){                   //Начинаем преобразовывать строки в числа
            try {
                final_array[i] = Integer.valueOf(strnumbers[i]);      //преобразовываем полученые строки в числа
                acept = true;
            }   catch (NumberFormatException e)                       //отлов исключения на предмет неправильного ввода
                {
                    acept = false;                                    //попалась строка типа 4-7
                    String[] str = strnumbers[i].split("-");   //разбиваем ее на строки по сивволу "-"
                    int[] tmp_array = new int[str.length];

                    for(int t = 0; t < str.length; t++){
                        try{
                            tmp_array[t] = Integer.valueOf(str[t]);   //преобразуем полученные строки в числа
                        } catch (NumberFormatException e1)
                          {
                                System.out.print("Введен неверный формат строки");
                                return;
                          }
                    }
                    Transformation.trans(tmp_array[0], tmp_array[1]);   //выводим последовательность нехватающих чисел
                }                                                       //после развертки 4-7
            if (acept) System.out.print(final_array[i] + ",");          //вывод чисел которые были сразу преобразованны
        }
    }
}


