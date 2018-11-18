public class Task3 {

    public static void main(String[] args) {

        String StrPrint = "";
        String str = args[0];

        String[] myCharArray = str.split(",");

        for(String ch:myCharArray){

            if (ch.contains("-")) {

                int IndexSymbol = ch.indexOf("-");
                int FirstNumber =  Integer.parseInt(ch.substring(0, IndexSymbol));
                int SecondNumber =  Integer.parseInt(ch.substring(IndexSymbol + 1));

                SecondNumber ++;

                    while (FirstNumber != SecondNumber) {

                        StrPrint = StrPrint + "," + FirstNumber;

                        FirstNumber ++;
                    }
            }
            else {
                StrPrint = StrPrint + "," + ch;
            }
        }

        StrPrint = StrPrint.substring(1);

        System.out.println(StrPrint);
    }
}


