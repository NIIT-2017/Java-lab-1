public class Task4 {
    static int numMin=0,numAv=0, numMax=0;
    static int count=0;

    static String madeFinishLine(String startLine){

        StringBuffer stLineBuf = new StringBuffer(startLine);
        StringBuffer finishLine = new StringBuffer("");
        StringBuffer bufNum = new StringBuffer("");
        int num=0;
        int i=0;
        char c = 0;
        for (i = 0; i < stLineBuf.length(); i++) {
            c = stLineBuf.charAt(i);
            if (c != ','){
                bufNum.append(c);
            }
            else { //if c==','
                String buffNum=new String(bufNum);
                num=Integer.parseInt(buffNum);
                analisNum(num, finishLine, i,stLineBuf.length());
                bufNum.delete(0,buffNum.length()); //clear bufNum
            }
        }
        String buffEnd=new String(bufNum);
        num=Integer.parseInt(buffEnd);
        analisNum(num, finishLine,i,stLineBuf.length());

        if (numMin!=0 && numAv!=0 && numMax==0){
            finishLine.append(String.valueOf(numMin));
            finishLine.append(",");
            finishLine.append(String.valueOf(numAv));
        }
        numMin=0;
        numAv=0;
        numMax=0;

        return finishLine.toString();
    }

    static StringBuffer analisNum(int num, StringBuffer finishLine, int i, int size){

        if(numMin==0 && numAv==0 && numMax==0){
            numMin=num;
        }
        else if(numMin!=0 && numAv==0 && numMax==0){
            numAv=num;
        }
        else if(numMin!=0 && numAv!=0 && numMax==0){
            numMax=num;
        }

        if (numMin!=0 && numAv!=0 && numMax!=0){
            if (numMax-numMin != 2 && count==0){
                finishLine.append(String.valueOf(numMin));
                finishLine.append(",");
                numMin=numAv;
                numAv=numMax;
                numMax=0;

            }
            else if ( numMax-numMin == 2 && count==0)//we GO in diapason
            {
                finishLine.append(String.valueOf(numMin));
                finishLine.append("-");
                count=1;
                numMin=numAv;
                numAv=numMax;
                numMax=0;
            }

            else if (numMax-numMin == 2 && count==1 && i!=size) //we also in diapason
            {
                int a=size;
                //not add
                numMin=numMax;
                numAv=0;
                numMax=0;
            }
            else if (numMax-numMin == 2 && count==1 && i==size) //we in end of Array
            {
                finishLine.append(String.valueOf(numMax));
            }
            else if (numMax-numMin != 2 && count==1) //we open dor
            {
                //add finishLine append numMin + ","
                finishLine.append(String.valueOf(numMin));
                finishLine.append(",");
                count=0;
                numMin=numAv;
                numAv=numMax;
                numMax=0;
            }
        }
        return finishLine;
    }


    public static void main(String[] args) {
        String startLine = args[0];
        String finish="";
        finish= Task4.madeFinishLine(startLine);
        System.out.println("We have "+startLine+" or "+finish);
    }
}
