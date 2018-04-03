public class Task3 {
    public static void main(String[] args){
        if(args.length==0)
            return;
        Disassembly dis1=new Disassembly(args[0]);
        System.out.println(dis1.transform());
    }
}

class Disassembly{
    private String initialStr;
    private String finishStr;
    Disassembly(String str){
        initialStr=str.trim();
        finishStr="";
    }
    String transform(){
        String[] arrStr=initialStr.split(",");
        String[] arrStrDash;
        int temp1,temp2;
        int len=arrStr.length;
        for(int i=0;i<len;i++){
            if(arrStr[i].indexOf('-')!=-1){
                arrStrDash=arrStr[i].split("-");
                temp1=Integer.parseInt(arrStrDash[0]);
                temp2=Integer.parseInt(arrStrDash[1]);
                for(int j=temp1;j<=temp2;j++){
                    //finishStr=String.join(",",finishStr,Integer.toString(j));
                    finishStr+=","+j;
                }
                continue;
            }
            //finishStr=String.join(",",finishStr,arrStr[i]);
            finishStr+=","+arrStr[i];
        }
        finishStr=finishStr.replaceFirst(",","");
        return finishStr;
    }
}
