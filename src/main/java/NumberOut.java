public class NumberOut
{
    public static void main(String[] args) {
        String[] finalOut;
        String number = args[0];
        //String number = "123456789";
        Digits dig1=new Digits(number);
        finalOut = dig1.NumberToArr();
        for (int i=0; i<finalOut.length;i++)System.out.println(finalOut[i]);
    }
}

class Digits
{
    String [] outNumbers = new String[]{"","","","","","",""};
    String number;
    char[]numberInChar;
    String [][] digits;

    Digits(String in){
        this.number=in;
        numberInChar=number.toCharArray();
        digits= new String[][]{
                {" *** ","*   *","*   *","*   *","*   *","*   *"," *** "},          //цифра 0
                {" * ","** "," * "," * "," * "," * ","***"},                        //цифра 1
                {" *** ","*   *","*  * ","  *  "," *   ","*    ","*****"},          //цифра 2
                {" *** ","*   *","    *","  ** ","    *","*   *"," *** "},          //цифра 3
                {"   *  ","  **  "," * *  ","*  *  ","******","   *  ","   *  "},   //цифра 4
                {"****","*   ","*** ","   *","   *","   *","*** "},                 //цифра 5
                {"*    ","*    ","*    ","**** ","*   *","*   *","**** "},          //цифра 6
                {"*****","    *","   * ","  *  "," *   ","*    ","*    "},          //цифра 7
                {" *** ","*   *","*   *"," *** ","*   *","*   *"," *** "},          //цифра 8
                {" ****","*   *","*   *"," ****","    *","    *","    *"}           //цифра 9
        };
    }


    String[] NumberToArr(){
            for (int j = 0; j < numberInChar.length; j++)
                switch (numberInChar[j]) {
                    case '0':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[0][i];
                        break;

                    case '1':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[1][i];
                        break;
                    case '2':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[2][i];
                        break;
                    case '3':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[3][i];
                        break;
                    case '4':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[4][i];
                        break;
                    case '5':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[5][i];
                        break;
                    case '6':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[6][i];
                        break;
                    case '7':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[7][i];
                        break;
                    case '8':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[8][i];
                        break;
                    case '9':
                        for (int i=0; i<digits[0].length;i++) outNumbers[i]+=digits[9][i];
                        break;
                        default:
                }
                return outNumbers;
    }
}