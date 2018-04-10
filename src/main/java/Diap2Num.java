public class Diap2Num {
    public static String strDiap2Num(String strIn) {
        String[] strSplit = strIn.split(",");
        String strOut = "";
        for (int i = 0; i < strSplit.length; i++) {
            boolean isLastIdx = i == (strSplit.length - 1);
            if (!strSplit[i].contains("-")) {
                strOut = strOut.concat(strSplit[i]);
                if (!isLastIdx)
                    strOut = strOut.concat(",");
            }
            else {
                int idx = strSplit[i].indexOf("-");
                int beg = Integer.parseInt(strSplit[i].substring(0,idx));
                int end = Integer.parseInt(strSplit[i].substring(idx+1));
                for (int j = beg; j <= end; j++) {
                    strOut = strOut.concat(Integer.toString(j));
                    if (!(isLastIdx && (j == end)))
                        strOut = strOut.concat(",");
                }
            }
        }
        return strOut;
    }
    /*public static void main(String args[]) {
        String strIn = args[0];
        String strOut = strDiap2Num(strIn);
        System.out.print(strOut);
    }*/
}
