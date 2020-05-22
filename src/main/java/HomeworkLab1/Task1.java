package HomeworkLab1;
public class Task1 {
   public static  long   func()
    {   long maxNumber=0;
        for(int i=2;i<1000000;i++)
        {
            long  tmp=i,currentNumber=0;
            while(tmp!=1)
            {
                if(tmp%2==0)
                {
                    tmp/=2;
                }
                else
                {
                    tmp=(tmp*3)+1;
                }
                currentNumber++;
            }
            if(maxNumber<currentNumber)
                maxNumber=currentNumber;
        }
        return maxNumber;
    }
}
