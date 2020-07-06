public class Task3 {

String makeFinishLine(String startLine) {
    StringBuffer stLineBuf = new StringBuffer(startLine);
    StringBuffer finishLine = new StringBuffer("");
    char c = 0;
    for (int i = 0; i < stLineBuf.length(); i++) {
        c = stLineBuf.charAt(i);
        if (c != '-')
            finishLine.append(c);
        else  //if c=='-'
        finishLine.append(replaseDefis(i, stLineBuf));   //("string")
    }
    return finishLine.toString();
}

StringBuffer replaseDefis(int defis, StringBuffer stLineBuf){
        StringBuffer defisChange=new StringBuffer(",");
        int min=0, max=0, nextNum=0,delta=0;
        min=findMin(defis,stLineBuf);
        max=findMax(defis,stLineBuf);
        delta=max-min-1;

    for(int i=0;i<delta;i++){
        if(i==0){
            nextNum=min+1;
            defisChange.append(String.valueOf(nextNum));
            defisChange.append(",");
        }
        else{//i>0
            nextNum=nextNum+1;
            defisChange.append(String.valueOf(nextNum));
            defisChange.append(",");
        }
    }
    return defisChange;
}
int findMin(int index,StringBuffer stLineBuf){
    int indexEnd=index;
    int indexStart=0;
    for(int i=index-1;i>=0 ;i--) {
        char c = stLineBuf.charAt(i);
        if (c==',') {
            indexStart=i+1; //+1
            break; }
    }
       char[] buf=new char[indexEnd-indexStart];
       stLineBuf.getChars(indexStart,indexEnd,buf,0);
       String buff= new String(buf);
       int min=Integer.parseInt(buff);

       return min;
   }

   int findMax(int index,StringBuffer stLineBuf){
        int indexEnd=0;
        int indexStart=index+1;
        int i=0;
        for(i=index+1;i<stLineBuf.length() ;i++) {
            char c = stLineBuf.charAt(i);
            if (c==',')
                break;
        }
        indexEnd=i; //if it is the end of our array
        char[] buf=new char[indexEnd-indexStart];
        stLineBuf.getChars(indexStart,indexEnd,buf,0);
        String buff= new String(buf);
        int max=Integer.parseInt(buff);

        return max;
    }

    public static void main(String[] args) {
        String startLine = "";
        String finishLine="";
        //only in main, because we have args[]
        for(int i=0;i<args.length;i++)
            if (i == 0)
                startLine = args[i];
            else {
                startLine = String.join(",", startLine, args[i]);
            }
        //System.out.println(startLine);
        Task3 task3=new Task3();
        finishLine=task3.makeFinishLine(startLine);
        System.out.println("We have:"+startLine+" or "+finishLine);
    }
}
