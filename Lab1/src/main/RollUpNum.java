
public class RollUpNum {
    public static void main(String args[]) {
        String inpStr = args[0];
        String[] inpStrToArr = inpStr.split(",");
        int[] arrOfIntNums = new int[inpStrToArr.length+1];
        boolean inSequence = false;
       // String outString = new String(inpStrToArr[0]);
        String outString=new String();
        int count=1;
       // outString=inpStrToArr[0];
        for(int i=0;i<inpStrToArr.length;i++)
            arrOfIntNums[i]=Integer.parseInt(inpStrToArr[i]);

        for (int i = 0; i < arrOfIntNums.length-1; i++) {
            if(arrOfIntNums[i]==arrOfIntNums[i+1]-1){
                count++;
                if(count<=2) {
                    if (outString.length() == 0) {
                        outString = outString + arrOfIntNums[i];
                    } else {
                        outString = outString + "," + arrOfIntNums[i];
                    }
                }
            }

            else {
                if((count<=2)&&(arrOfIntNums[i]==arrOfIntNums[0])) {
                    outString = outString + arrOfIntNums[i];
                }
                else if(count<=2){
                    outString = outString + ","+arrOfIntNums[i];
                }
                else {
                    outString = outString + "-" + arrOfIntNums[i];
                }
                count=1;
            }


        }

System.out.print(outString);
    }

}

