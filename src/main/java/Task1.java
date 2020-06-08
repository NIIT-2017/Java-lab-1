
public class Task1 {

    static long collaz(long number){
        long val = 0;
        do {                            //decompose the number in a sirokuzky sequence
            if ((number % 2) == 0)      //even number
                number = number/2;
            else                        //odd number
                number = number*3+1;
            val++;
        } while (number != 1);
        return val;
    }

    public static void main (String[] args){
        long a_max = 0;
        long count = 0;
        long count_max = 0;
        for (long i = 2; i < 1000000; i++){
            count = collaz(i);
            if (count >= count_max) {
                count_max = count;
                a_max = i;
            }
            count = 0;
        }
        System.out.println("Greatest sequence - " + count_max + " steps for a number - "  + a_max);
    }
}