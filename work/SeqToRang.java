//Задача 4. Свертка числовых диапазонов
class SeqToRang {
    public static void main(String[] args){
        if(args.length<1) {
            throw new IllegalArgumentException("Zero input");//прерывание при вводе пустой строки
        }
        String str=args[0];
        String[] strArr=str.split(",");
        int[] num=new int[strArr.length];
        String out= strArr[0];
        boolean isRang=false;
        for(int x=0;x<strArr.length;x++){
            num[x]=Integer.parseInt(strArr[x]);
        }
        for(int x=2; x<num.length; x++) {
            if((num[x]-num[x-1])==1&&(num[x-1]-num[x-2])==1){
                isRang=true;
                }
            else if(isRang) {
                out = out + "-" + num[(x - 1)];
                isRang = false;
            }
            else {
                out = out + ',' + num[(x-1)];
                }
            }
        if(isRang) {
            out = out + "-" + num[(num.length-1)];
                    }
        else {
            out = out + ',' + num[(num.length-1)];
        }
        System.out.println(out);
        }
    }