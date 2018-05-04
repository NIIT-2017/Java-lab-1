public class ClottingRange {
    public static void main (String[] args){
        String line = args[0];
        //String line = "1,3,5,6,7,8,12,15,16,17,18,19,20,23,24,25";
        String newLine;
        Clotting range = new Clotting(line);
        newLine = range.PrintLine();
        System.out.println(newLine);

    }
}

class Clotting{
    private  String finishString = "";
    private String[] numbers;
    private String range;
    int buf;
    int count;

    Clotting(String line){
        range=line;
        numbers= range != null ? range.split(",") : new String[0];
    }

    String PrintLine() {
        for (int i=0;i<numbers.length;i++){
            buf=Integer.parseInt(numbers[i]);
            count=0;
           for (int j=i+1;j<numbers.length;j++){
               if (buf+1==Integer.parseInt(numbers[j])){
                   count++;
                   buf=Integer.parseInt(numbers[j]);
               }
           }
           if (count>1){
               if (i+count==numbers.length-1){
                   finishString+=numbers[i]+"-"+numbers[i+count];
                   i+=count;
               }
               else{
                   finishString+=numbers[i]+"-"+numbers[i+count]+",";
                   i+=count;
               }
           }
           else {
               if (i==numbers.length-1) finishString+=numbers[i];
               else
                   finishString+=numbers[i]+",";
           }
        }

        return finishString;
    }


}