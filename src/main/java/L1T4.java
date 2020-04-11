public class L1T4
{
    public static String zoom(String line)
    {
        StringBuilder sb = new StringBuilder();
        int i=0, lnumb=0;
        int[] numb = new int[line.length()];
        while(i<line.length())
        {
            int pos = line.indexOf(',', i);
            if(pos > 0)
            {
                String str=line.substring(i, pos);
                numb[lnumb] = Integer.parseInt(str);
                lnumb++;
                i = pos+1;
            }
            else
                {
                pos = line.indexOf('.', i);
                if(pos == -1)
                    pos = line.length();
                String str=line.substring(i, pos);
                numb[lnumb] = Integer.parseInt(str);
                lnumb++;
                i=pos+1;
            }
        }
        int j=0;
        while(j<lnumb)
        {
            if(numb[j] == numb[j+1]-1)
            {
                int k = j;
                while(numb[k] == numb[k+1]-1)
                {
                    k++;
                }
                if(k-j>1)
                {
                    sb.append(numb[j]+"-"+numb[k]+((k==lnumb-1)?"":","));
                    j=k+1;
                }
                else
                    {
                    sb.append(numb[j]+ ((j==lnumb-1)?"":","));
                    j++;
                }
            }
            else
                {
                sb.append(numb[j]+((j==lnumb-1)?"":","));
                j++;
            }
        }
        String result = sb.toString();
        return result;
    }
    public static void main(String[] args)
    {
        if(args.length == 0)
            return;
        String result = zoom(args[0]);
        System.out.println(result);
    }
}
