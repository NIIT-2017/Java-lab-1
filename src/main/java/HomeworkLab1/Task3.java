package HomeworkLab1;

import javafx.util.Builder;

public class Task3 {
    public static String sequence(String str)
    {   StringBuilder result=new StringBuilder();
        for(String range:  str.split(","))
        {
            String []numbers=range.split("-");
            int firstNumber=Integer.parseInt(numbers[0]);
            int secondNumber=firstNumber;
            if(numbers.length==2)
            {
                secondNumber=Integer.parseInt(numbers[1]);
            }
            for(int i=firstNumber;i<=secondNumber;i++)
            {
                result.append(String.valueOf(i));
                result.append(",");
            }
        }
        result.deleteCharAt(result.length()-1);
      return  result.toString();
    }
}
