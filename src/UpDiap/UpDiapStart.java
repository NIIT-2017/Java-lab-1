package UpDiap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class UpDiapStart {
    static String word;
    public static void main(String[] args) {
        String cont;
        int startDiap;
        int endDiap;
        int arrayIndex;
        ArrayList<String> numString = new ArrayList<>();
        try {
            BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

                word = d.readLine();

            for(String r : word.split(",")) {
                numString.add(r);
            }
        } catch(Exception ex) { ex.printStackTrace(); }
            for(int i = 0; i<numString.size(); i++) {
                if (numString.get(i).contains("-")) {
                    String[] test = numString.get(i).split("-");
                    numString.remove(i);
                    startDiap = Integer.parseInt(test[0]);
                    endDiap = Integer.parseInt(test[1]);
                    for(Integer j = endDiap; j>=startDiap; j--) {
                        numString.add(i, j.toString());
                    }
                }
            }
            for(int i = 0; i<numString.size()-1; i++) {
                System.out.print(numString.get(i)+",");
            }
            System.out.print(numString.get(numString.size()-1));

    }
}
