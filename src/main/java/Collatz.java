public class Collatz {
    public static void main(String[] arg) {
        System.out.println(maxColatz(1000000));
    }
    public static String maxColatz(int lim){
        int num=0, max=0;
        long count=0, count_max=0;
        for(int i =1;i<=lim;i++){
            count = getColatz(i);
            if(count>count_max)
            {
                count_max=count;
                max=i;
            }
            count=0;
        }
        return("максимальная последовательность у чилса "+max
                +" , длинна последовательности "+count_max);
    }
    public static int getColatz(int num){
        int count=0;
        while(num>1){
            if(num%2==1) num= 3*num+1;
            else num/=2;
            count++;
        }
        return count;
    }
}