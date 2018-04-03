public class Task4 {
    public static void main(String[] args){
        if(args.length==0)
            return;
        Assembly ass1=new Assembly(args[0]);
        System.out.println(ass1.transform());
    }
}

class Assembly{
    private String initialStr;
    private String finishStr;
    private String [] arrStr;
    Assembly(String str){
        initialStr=str.trim();
        finishStr = "";
    }
    String transform(){
        arrStr=initialStr.split(",");
        int len=arrStr.length;
        int count=0,i;
        boolean in=false;
        for(i=0;i<len-1;i++){
            if(Integer.parseInt(arrStr[i+1])==(Integer.parseInt(arrStr[i])+1)){
                count++;
                continue;
            }
            add(count,i);
            count=0;
        }
        add(count,i);
        finishStr=finishStr.replaceFirst(",","");
        return finishStr;
    }

    private void add(int count,int i){
        switch (count){
            case 1:
                finishStr+=","+arrStr[i-1]+","+arrStr[i];
                break;
            case 0:
                finishStr+=","+arrStr[i];
                break;
            default:
                finishStr+=","+arrStr[i-count]+"-"+arrStr[i];
        }
    }
}
