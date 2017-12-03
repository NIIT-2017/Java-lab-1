public class MaxKollatz {
    int a,b;
    int maxLength;
    int maxValue;

    public MaxKollatz(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    public void searchMax()
    {
        for (int i=a; i <= b;i++)
        {
            int k=1;
            long ii = i;
            while (ii != 1)
            {
                if (ii % 2 == 0) ii = ii / 2;
                else ii = ii * 3 + 1;
                k++;
            }
            if (k>maxLength)
            {
                maxLength=k;
                maxValue=i;
            }
        }
    }

    public int getMaxLength()
    {
        return maxLength;
    }
    public int getMaxValue()
    {
        return maxValue;
    }
}
