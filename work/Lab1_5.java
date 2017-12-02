public class Lab1_5 {
    public static void main (String [] args){

        String [] m0 = {"  ***  "," *   * ","*     *","*     *","*     *"," *   * ","  ***  "};
        String [] m1 = {"  *  "," **  ","  *  ","  *  ","  *  ","  *  "," *** "};
        String [] m2 = {"  ***  "," *   * ","    *  ","   *   ","  *    "," *     "," ***** "};
        String [] m3 = {"  ***  ","     * ","     * ","  ***  ","     * ","     * ","  ***  "};
        String [] m4 = {"    *  ","   **  ","  * *  "," *  *  "," ***** ","    *  ","    *  "};
        String [] m5 = {" ***** "," *     "," *     "," ****  ","     * "," *   * ","  ***  "};
        String [] m6 = {"    *  ","   *   ","  *    "," ****  "," *   * "," *   * ","  ***  "};
        String [] m7 = {" ***** ","     * ","    *  ","   *   ","  *    "," *     "," *     "};
        String [] m8 = {"  ***  "," *   * "," *   * ","  ***  "," *   * "," *   * ","  ***  "};
        String [] m9 = {"  ***  "," *   * "," *   * ","  **** ","     * ","    *  ","   *   "};
        int i = 0;
        String str = "",entr = "";

        for (int k=0;k<args.length;k++) {
            entr = args[k];
            while (i < m0.length) {
                for (int j = 0; j < entr.length(); j++) {

                    if (entr.charAt(j) == '0') str = str + m0[i];// + "\t";
                    if (entr.charAt(j) == '1') str = str + m1[i];// + "\t";
                    if (entr.charAt(j) == '2') str = str + m2[i];// + "\t";
                    if (entr.charAt(j) == '3') str = str + m3[i];// + "\t";
                    if (entr.charAt(j) == '4') str = str + m4[i];// + "\t";
                    if (entr.charAt(j) == '5') str = str + m5[i];// + "\t";
                    if (entr.charAt(j) == '6') str = str + m6[i];// + "\t";
                    if (entr.charAt(j) == '7') str = str + m7[i];// + "\t";
                    if (entr.charAt(j) == '8') str = str + m8[i];// + "\t";
                    if (entr.charAt(j) == '9') str = str + m9[i];// + "\t";

                }
                str = str + "\n";
                i++;
            }
            i = 0;
        }

        System.out.println(str);
    }
}
