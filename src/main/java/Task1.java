public class Task1 {
    public static void main(String[] args)
    {
        Collatz col1=new Collatz();
        col1.findQueue(1000000);
        System.out.println("The longest queue for a number "+col1.number+" is "+col1.countMax);
    }
}

class Collatz{
    long countMax;
    long count;
    long number;
    Collatz(){
        countMax=0;
        count=0;
        number=0;
    }
   void calcCollatz(long num){
        if (num == 1){
          count++;
        }
        else if (num % 2 == 0){
            count++;
            calcCollatz(num / 2);
        }
        else{
            count++;
            calcCollatz(3 * num + 1);
        }
    }
    void findQueue(long num) {
        for (long i = 1; i <= num; i++) {
            calcCollatz(i);
            if(count>countMax){
                countMax=count;
                number=i;
            }
            count=0;
        }
    }
}
