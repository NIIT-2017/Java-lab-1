import java.util.Scanner;

class CharASCIIART {
    private String line0,line1, line2, line3, line4, line5, line6;
//the constructor
    CharASCIIART(char ch){
        if (ch == '0'){
            this.line0="  ***  ";
            this.line1=" *   * ";
            this.line2=" *   * ";
            this.line3=" *   * ";
            this.line4=" *   * ";
            this.line5=" *   * ";
            this.line6="  ***  ";
        }
        else if (ch == '1'){
            this.line0="   *   ";
            this.line1="  **   ";
            this.line2="   *   ";
            this.line3="   *   ";
            this.line4="   *   ";
            this.line5="   *   ";
            this.line6=" ***** ";
        }
        else if (ch == '2'){
            this.line0="  ***  ";
            this.line1=" *   * ";
            this.line2=" *   * ";
            this.line3="    *  ";
            this.line4="   *   ";
            this.line5=" *     ";
            this.line6=" ***** ";
        }
        else if (ch == '3'){
            this.line0="  ***  ";
            this.line1=" *   * ";
            this.line2="     * ";
            this.line3="  **** ";
            this.line4="     * ";
            this.line5=" *   * ";
            this.line6="  ***  ";
        }
        else if (ch == '4'){
            this.line0="     * ";
            this.line1="    ** ";
            this.line2="   * * ";
            this.line3="  *  * ";
            this.line4=" *   * ";
            this.line5="*******";
            this.line6="     * ";
        }
        else if (ch == '5'){
            this.line0=" ***** ";
            this.line1=" *     ";
            this.line2=" *     ";
            this.line3=" ***** ";
            this.line4="     * ";
            this.line5=" *   * ";
            this.line6="  ***  ";
        }
        else if (ch == '6'){
            this.line0="  ***  ";
            this.line1=" *   * ";
            this.line2=" *     ";
            this.line3=" ***** ";
            this.line4=" *   * ";
            this.line5=" *   * ";
            this.line6="  ***  ";
        }
        else if (ch == '7'){
            this.line0=" ***** ";
            this.line1="     * ";
            this.line2="    *  ";
            this.line3="   *   ";
            this.line4="   *   ";
            this.line5="   *   ";
            this.line6="   *   ";
        }
        else if (ch == '8'){
            this.line0="  ***  ";
            this.line1=" *   * ";
            this.line2=" *   * ";
            this.line3="  ***  ";
            this.line4=" *   * ";
            this.line5=" *   * ";
            this.line6="  ***  ";
        }
        else if (ch == '9'){
            this.line0="  ***  ";
            this.line1=" *   * ";
            this.line2=" *   * ";
            this.line3="  **** ";
            this.line4="     * ";
            this.line5=" *   * ";
            this.line6="  ***  ";
        }
        else {                    //unknown symbol
            this.line0=" ***** ";
            this.line1=" ***** ";
            this.line2=" ***** ";
            this.line3=" ***** ";
            this.line4=" ***** ";
            this.line5=" ***** ";
            this.line6=" ***** ";
        }
    }
//the getters
    String getLine0(){return line0;}
    String getLine1(){return line1;}
    String getLine2(){return line2;}
    String getLine3(){return line3;}
    String getLine4(){return line4;}
    String getLine5(){return line5;}
    String getLine6(){return line6;}
}

class StringToPicture {
    private String[] picture;
//the constructor
    StringToPicture(String line){
        this.picture = new String[]{"","","","","","",""};
        char[] chars = line.toCharArray();
        for (char ch:chars) {
            CharASCIIART ca = new CharASCIIART(ch);
            this.picture[0]=this.picture[0].concat(ca.getLine0());
            this.picture[1]=this.picture[1].concat(ca.getLine1());
            this.picture[2]=this.picture[2].concat(ca.getLine2());
            this.picture[3]=this.picture[3].concat(ca.getLine3());
            this.picture[4]=this.picture[4].concat(ca.getLine4());
            this.picture[5]=this.picture[5].concat(ca.getLine5());
            this.picture[6]=this.picture[6].concat(ca.getLine6());
        }
    }
//the printer
    void printPicture(){
        for (String s:this.picture) {
            System.out.println(s);
        }
    }
}

public class Lab1Task5 {
    public static void main(String[] args) {
        System.out.println("Input the number");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        StringToPicture stp = new StringToPicture(line);
        stp.printPicture();
    }
}
