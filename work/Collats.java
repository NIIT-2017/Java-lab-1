public class Collats {
    public static void main(String[] args) {
        //System.out.println("Hello, people");
        //System.out.println(collats(100));
        int max = 0;
        int num =0;
        for (int i = 1; i <=1000000 ; i++) {
            int col = collats(i);
            if (col>max){
                max = col;
                num = i;

            }
        }
        System.out.print("Длина максимальной последовательности ");
        System.out.println(max);
        System.out.print("Число с максимальной последовательностью ");
        System.out.println(num);

    }
    static int collats(long n) {
        int i=1;
        while(n!=1){
        if (n%2 == 0) {
            n = n/2;
            i++;
        }
        else {
            n = 3*n+1;
            i++;
        }}
        return i;
    }
}
