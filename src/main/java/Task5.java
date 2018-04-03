public class Task5 {
    public static void main(String[] args){
        if(args.length==0)
            return;
        NumToSym nts1=new NumToSym(args[0]);
        nts1.transform();
    }
}

class NumToSym{
    private int initialNumber;
    private String[] arrFinishStr;
    private final int size=7;
    public NumToSym(int num){
        initialNumber=num;
        arrFinishStr=new String[size];
        for(int i=0;i<size;i++)
            arrFinishStr[i]="";
    }
    public NumToSym(String num){
        this(Integer.parseInt(num.trim()));
    }

    public void transform(){
        decompositionNumber(initialNumber);
        printArrDigits();
    }

    private void printArrDigits()
    {
        for(int i=0;i<size;i++)
            System.out.print(arrFinishStr[i]+"\n");
    }

    private void decompositionNumber(int num){
        if(num/10<1){
            digitToString(num%10);
            digitToString(-1);
        }
        else{
            decompositionNumber(num/10);
            digitToString(num%10);
            digitToString(-1);
        }
    }


    private void digitToString(int digit){
        switch (digit){
            case -1:
                arrFinishStr[0]+="  ";
                arrFinishStr[1]+="  ";
                arrFinishStr[2]+="  ";
                arrFinishStr[3]+="  ";
                arrFinishStr[4]+="  ";
                arrFinishStr[5]+="  ";
                arrFinishStr[6]+="  ";
                break;
            case 0:
                arrFinishStr[0]+="  ***  ";
                arrFinishStr[1]+=" *   * ";
                arrFinishStr[2]+="*     *";
                arrFinishStr[3]+="*     *";
                arrFinishStr[4]+="*     *";
                arrFinishStr[5]+=" *   * ";
                arrFinishStr[6]+="  ***  ";
                break;
            case 1:
                arrFinishStr[0]+="   *   ";
                arrFinishStr[1]+=" * *   ";
                arrFinishStr[2]+="   *   ";
                arrFinishStr[3]+="   *   ";
                arrFinishStr[4]+="   *   ";
                arrFinishStr[5]+="   *   ";
                arrFinishStr[6]+=" ***** ";
                break;
            case 2:
                arrFinishStr[0]+=" ***** ";
                arrFinishStr[1]+="*     *";
                arrFinishStr[2]+="*     *";
                arrFinishStr[3]+="    *  ";
                arrFinishStr[4]+="   *   ";
                arrFinishStr[5]+="  *    ";
                arrFinishStr[6]+=" ******";
                break;
            case 3:
                arrFinishStr[0]+=" ***** ";
                arrFinishStr[1]+="*     *";
                arrFinishStr[2]+="      *";
                arrFinishStr[3]+="  * *  ";
                arrFinishStr[4]+="      *";
                arrFinishStr[5]+="*     *";
                arrFinishStr[6]+=" ***** ";
                break;
            case 4:
                arrFinishStr[0]+="*     *";
                arrFinishStr[1]+="*     *";
                arrFinishStr[2]+="*     *";
                arrFinishStr[3]+="*******";
                arrFinishStr[4]+="      *";
                arrFinishStr[5]+="      *";
                arrFinishStr[6]+="      *";
                break;
            case 5:
                arrFinishStr[0]+="*******";
                arrFinishStr[1]+="*      ";
                arrFinishStr[2]+="*      ";
                arrFinishStr[3]+="*******";
                arrFinishStr[4]+="      *";
                arrFinishStr[5]+="*     *";
                arrFinishStr[6]+="*******";
                break;
            case 6:
                arrFinishStr[0]+="*******";
                arrFinishStr[1]+="*      ";
                arrFinishStr[2]+="*      ";
                arrFinishStr[3]+="*******";
                arrFinishStr[4]+="*     *";
                arrFinishStr[5]+="*     *";
                arrFinishStr[6]+="*******";
                break;
            case 7:
                arrFinishStr[0]+="*******";
                arrFinishStr[1]+="*     *";
                arrFinishStr[2]+="     * ";
                arrFinishStr[3]+="    *  ";
                arrFinishStr[4]+="   *   ";
                arrFinishStr[5]+="  *    ";
                arrFinishStr[6]+="  *    ";
                break;
            case 8:
                arrFinishStr[0]+="*******";
                arrFinishStr[1]+="*     *";
                arrFinishStr[2]+="*     *";
                arrFinishStr[3]+="*******";
                arrFinishStr[4]+="*     *";
                arrFinishStr[5]+="*     *";
                arrFinishStr[6]+="*******";
                break;
            case 9:
                arrFinishStr[0]+="*******";
                arrFinishStr[1]+="*     *";
                arrFinishStr[2]+="*     *";
                arrFinishStr[3]+="*******";
                arrFinishStr[4]+="      *";
                arrFinishStr[5]+="      *";
                arrFinishStr[6]+="*******";
                break;
        }
    }





}
