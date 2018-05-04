import java.text.ParseException;

public class RangeDeployment {
    public static void main (String[] args){
        String line = args[0];
       // String line = "1,3,5-8,12,15-20,23";
        String newLine;
        Deployment range = new Deployment(line);
        newLine = range.PrintLine();
        System.out.println(newLine);
    }
}


class Deployment{
    private  String finishString = "";
    private String[] numbers;
    private String range;
    private String[] rangeNumbers = new String[2];

    Deployment(String line){
        range=line;
        numbers= range != null ? range.split(",") : new String[0];
    }

    public boolean isInteger(String string){
        try{
            Integer.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            return  false;
        }
    }

    String PrintLine(){
        int first,second;
        for (int i=0; i < numbers.length;i++) {
            if (isInteger(numbers[i]) == true){
                finishString+=numbers[i];
                if (i+1<numbers.length) finishString+=",";
            }
            else{
                rangeNumbers = numbers[i].split("-", 2);
                for (int j = Integer.parseInt(rangeNumbers[0]);j <= Integer.parseInt(rangeNumbers[1]);j++){
                    finishString+=j;
                    if (i+1<numbers.length) finishString+=",";
                    else{
                        if (j<Integer.parseInt(rangeNumbers[1])) finishString+=",";
                    }
                }
            }
        }
       return finishString;
    }


}
