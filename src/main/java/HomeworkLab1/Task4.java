package HomeworkLab1;

public class Task4 {
    public static String convolve(String str)
    {
        String []numbers=str.split(",");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<numbers.length;)
        {
            int first=Integer.parseInt(numbers[i]);
            result.append(numbers[i]);
            int last=first;
            i++;
            for(;i<numbers.length;i++)
            {
                if(Integer.parseInt(numbers[i])==last+1)
                    last=Integer.parseInt(numbers[i]);
                else
                    break;
            }
            if(last!=first) {
                result.append("-");
                result.append(last);
                result.append(",");
            }
            else
            {
                result.append(",");
            }
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
