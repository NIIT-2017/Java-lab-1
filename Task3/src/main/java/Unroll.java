public class Unroll {
    public static void main(String args[]){
        String inpStr=args[0];
        String[]partsOfInpString=inpStr.split(",");
        String newString="";//new string for unrolled sequence

        for(int i=0;i<partsOfInpString.length;i++){
           if(partsOfInpString[i].contains("-")) {
             int posOfdash = partsOfInpString[i].indexOf("-");//search for position of "-"
             int first = Integer.parseInt(partsOfInpString[i].substring(0, posOfdash));
             int last = Integer.parseInt(partsOfInpString[i].substring(posOfdash + 1));
             for (int x = first; x <= last; x++) {
                 newString = newString + x + ",";
             }
           }
           else if(!partsOfInpString[i].contains("-")){
             newString=newString+partsOfInpString[i]+",";
           }
        }

        System.out.print(newString.substring(0,newString.length()-1));
    }
}
