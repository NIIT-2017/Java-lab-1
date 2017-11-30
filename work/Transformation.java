//Класс для трансформирования записи 4-7 в 4,5,6,7

public class Transformation {

    public static void trans(int a,int b){

        int[] numbers = new int[b - a + 1];

        for (int i = 0; i < numbers.length; i++) {
                numbers[i] = a + i;
                System.out.print(numbers[i] + ",");
        }
   }
}
