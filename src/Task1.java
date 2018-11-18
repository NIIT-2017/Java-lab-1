
public class Task1 {
    public static void main(String[] args) {

        int c = 1;
        int number = 0;
        int sequence = 0;

        for (int i = 1; i < 1000000; i++){

            long b = i;
            c = 0;

            while (b != 1) {
                if ((b%2)==0){
                        b = b / 2;}
                    else{
                        b = 3*b + 1;}
                c++;
            }

            if (sequence < c) {
                number = i;
                sequence = c;
            }
        }
        System.out.println("Число " + number + " имеет количество последовательностей " + sequence);
    }
}

