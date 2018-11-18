
public class Task4 {

    public static void main(String[] args) {

        int PrevNumber = -1;
        int LastNumber = 0;
        int Sequence = 0;
        int CutLines = 0;
        int NumberOfLines = 0;

        String StrPrint = "";
        String str = args[0];

        String[] myCharArray = str.split(",");

        NumberOfLines = myCharArray.length-1;

        for(String ch:myCharArray){

            LastNumber =  Integer.parseInt(ch);

            if (ch == myCharArray[NumberOfLines]) {
                StrPrint = StrPrint + LastNumber;
                continue;
            }
            if (LastNumber == PrevNumber + 1) {
                Sequence ++;
                    if (Sequence == 1) {
                        CutLines = StrPrint.length()-1;}
                }
                else{
                    if (Sequence > 2){
                        StrPrint = StrPrint + PrevNumber + ",";
                    }
                Sequence = 0;
                }

            if (Sequence == 2){
                StrPrint = StrPrint.substring(0, CutLines);
                StrPrint = StrPrint + "-";
            }
            if (Sequence < 2){
                StrPrint = StrPrint + LastNumber + ",";
            }

            PrevNumber = LastNumber;
        }
        System.out.println(StrPrint);
    }
}
