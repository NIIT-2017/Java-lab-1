import javax.swing.*;

public class task1 {
    static long ml=0;

    static long seqCollatz(){
        long num=0, maxlennum=0;
        long i;
        for(i=0; i<1000000; i++) {
            num = collatz(i);
            if(num > ml){
                ml = num;
                maxlennum = i;
            }
        }
        return maxlennum;
    }

    static long collatz(long num){
        if(num>1){
            if(num%2>=1){
                return 1 + collatz(3*num+1);
            } else {
                return 1 + collatz(num/2);
            }
        } else
            return 1;
    }

    public static void main(String[] args) {
        seqCollatz();
        System.out.println(ml);
    }


}
