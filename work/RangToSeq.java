//Задача 3. Развертка числовых диапазонов
class RangToSeq  {

    public static void main(String[] args) {
        if(args.length<1) {
            throw new IllegalArgumentException("Zero input");//прерывание при вводе пустой строки
        }
        String str=args[0];
        String[] strArr=str.split(",");
        String out="";
        for(int x=0; x<strArr.length; x++) {
            String tempStr=strArr[x];
            String[] tempArr=tempStr.split("-");
            if(tempArr.length>2) {
                throw new IllegalArgumentException("Incorrect input");//прерывание при наличии более одного знака "-" в одном диапазоне.
            }
            if(tempArr.length==2){
                int nStart=Integer.parseInt(tempArr[0]);
                int nEnd=Integer.parseInt(tempArr[1]);
                if(nEnd<nStart) {
                    throw new IllegalArgumentException("Incorrect rang");
                }
                int[] rToNum=new int[nEnd-nStart+1];
                String rang=Integer.toString(nStart);
                for(int y=1;y<=(rToNum.length-1);y++){
                    rToNum[y]=nStart+y;
                    rang=rang+","+(nStart+y);
                }
                tempStr=rang;
            }
           out=out+","+tempStr;

        }
        System.out.println(out.substring(1));
    }

}
