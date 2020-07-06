public class Task1 {

    static long maxnum = 0;
    static long maxlen = 0;

    public static void main (String [] args){
        Collatz.seqCollatz();
        System.out.println("Max number = " + maxnum + " with max length = " + maxlen);
    }
}
