//Задание 1
public class collatz {

    public static int collatz(int x)
    {
        int elements = 1;
        while (x > 1) {
            if (x %2 == 0) {x = x / 2;}
            else {x = 3 * x + 1;}
            elements++;
        }
        return elements;
    }
    public static void main(String[] args) {
        int elements;
        int maxlenght = 1;
        int maxvalue = 1;
        for (int x=1; x<=1000000; x++)
        {
            elements = collatz(x);
            if (maxlenght < elements) {
                maxlenght = elements;
                maxvalue = x;
            }
        }
        System.out.println( "Число " + maxvalue);
        System.out.println( "Длинна последовательности " + maxlenght);
    }
}

