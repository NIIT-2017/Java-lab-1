public class Task1 {
    static int count=0;
    static int lineCollate(int i){
        count=0;
        while (i !=1){
            if(i%2==0){
                i=i/2;
                count=count+1;
            }
            else if(i%2!=0){
                i=i*3+1;
                count=count+1;
            }
        }
        return count+1; //if i==1 and +1, because for num=1 count=1
    }

     static int countMax(int min, int max){
        int count=0;
        int countMax=0;
        int numMax=0;
        for(int i=min;i<=max;i++){
            count=Task1.lineCollate(i);
            if(countMax<=count){
                countMax=count;
                numMax=i;
            }
        }
        //System.out.println("Maximum Collate sequence = "+countMax+" for number = "+numMax);
        return countMax;
    }

    public static void main(String[] args) {
       int sequenceMax=0;
        sequenceMax=Task1.countMax(1,1000000);
        System.out.println("Maximum Collate sequence = "+sequenceMax);
    }
}
