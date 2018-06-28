package DrawNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DrawNumberStart extends HelpMethods {
    static String word;
    static String[] finalNum={};
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            word = br.readLine();
        } catch (Exception ex) {ex.printStackTrace();}

        for(int i=0; i<word.length(); i++) {
            String[] help = callNumber(word.charAt(i));
            if (finalNum.length < 1) {
                finalNum = help;
            } else {
                for (int j = 0; j < help.length; j++) {
                    finalNum[j] = finalNum[j].concat(help[j]);
                }
            }
        }
        for(int i = 0; i<finalNum.length; i++) {
            System.out.println(finalNum[i]);
        }
    }


}