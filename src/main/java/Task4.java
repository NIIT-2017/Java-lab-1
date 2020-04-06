import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        String range = args[0];
        System.out.println(range);
        String closedRange = closedRange(range);
        System.out.println(closedRange);
    }

    public static String closedRange(String range) {
        String closedRange = "";
        if(range.length()==1)
            return range;
        ArrayList<Integer> list=new ArrayList<>();
        String[] arrSplit = range.split(",");
        //convert chars to integers and make ArrayList
        for (int i=0; i < arrSplit.length; i++)
        {
            int number = Integer.parseInt(arrSplit[i]);
            list.add(number);
        }
        int flag=1, first=0, last=0;
        for(int i=1;i<list.size();i++){
            //if number is one point bigger and flag=1 make previous to be first and flag++
            if((list.get(i)==(list.get(i-1)+1))&&(flag==1)){
                first=i-1;
                flag++;
            }
            //if number is one point bigger and flag>1 make namber to be last and flag++
            else if ((list.get(i)==(list.get(i-1)+1))&&(flag>1)){
                flag++;
                last=i;
            }
            /*if number is NOT one point bigger AND flag>2
            means that there was a range before, write previous range in a closed way (first-last,)*/
            else if ((list.get(i)!=(list.get(i-1)+1))&&(flag>2)){
                closedRange+=String.valueOf(list.get(first));
                closedRange+="-";
                closedRange+=String.valueOf(list.get(last));
                closedRange+=",";
                flag=1;
                first=i;
            }
            /*if number is NOT one point bigger AND flag==1
            means that there wasn't range for close before, so write previous number*/
            else if ((list.get(i)!=(list.get(i-1)+1))&&(flag==1)){
                closedRange+=String.valueOf(list.get(first));
                closedRange+=",";
                first=i;
            }
            /*if number is NOT one point bigger AND flag==2
            means that there was a range that consistes only of 2 symbols.
            It's not enough to close range, so write two numbers (first,first+1,)*/
            else if ((list.get(i)!=(list.get(i-1)+1))&&(flag==2)){
                closedRange+=String.valueOf(list.get(first));
                closedRange+=",";
                closedRange+=String.valueOf(list.get(first+1));
                closedRange+=",";
                flag=1;
            }
            }
        /*We need to check state of last number in sequence. If flag==1, write last number
        So if flag==2, write two last numbers, if bigger - write closed range*/
        if (flag==1){
            closedRange+=String.valueOf(list.get(first));
        }
        else if(flag==2) {
            closedRange+=String.valueOf(list.get(first));
            closedRange+=",";
            closedRange+=String.valueOf(list.get(first+1));
        }
        else if (flag>2){
                closedRange+=String.valueOf(list.get(first));
                closedRange+="-";
                closedRange+=String.valueOf(list.get(last));
            }
        return closedRange;
    }
}

