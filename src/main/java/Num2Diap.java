public class Num2Diap {
    private static String editLastDash(String strIn) {
        int idx = strIn.lastIndexOf("-");
        char[] chArr = strIn.toCharArray();
        chArr[idx] = ',';
        return new String(chArr);
    }
    public static String strNum2Diap(String strIn) {
        String[] strSplit = strIn.split(",");
        int[] arr = new int[strSplit.length];
        for (int i = 0; i < strSplit.length; i++)
            arr[i] = Integer.parseInt(strSplit[i]);

        String strOut = "";
        if (strSplit.length > 1)
            strOut = strSplit[0] + ",";
        else
            strOut = strSplit[0];

        boolean isDiap = false;
        int count = 0;
        for (int i = 1; i < strSplit.length; i++) {
            boolean isDiapCurr = (arr[i] - arr[i-1]) == 1;
            boolean isLastIdx = i == (strSplit.length - 1);
            if (!isDiap && isDiapCurr) {
                count++;
                strOut = strOut.substring(0,strOut.length()-1); //////
                strOut = strOut.concat("-");
                if (isLastIdx) {
                    strOut = strOut.concat(strSplit[i]);
                    strOut = editLastDash(strOut);
                }
            }
            else if (isDiap && isDiapCurr) {
                count++;
                if (isLastIdx) {
                    strOut = strOut.concat(strSplit[i]);
                }
            }
            else if (isDiap && !isDiapCurr) {
                strOut = strOut.concat(strSplit[i-1]);
                if (count == 1)
                    strOut = editLastDash(strOut);
                strOut = strOut.concat("," + strSplit[i]);
                if (!isLastIdx)
                    strOut = strOut.concat(",");
                count = 0;
            }
            else {
                strOut = strOut.concat(strSplit[i]);
                if (!isLastIdx)
                    strOut = strOut.concat(",");
                count = 0;
            }
            isDiap = isDiapCurr;
        }
        return strOut;
    }
    /*public static void main(String args[]) {
        String strIn = args[0];
        String strOut = strNum2Diap(strIn);
        System.out.println(strOut);

        //String str1 = editLastDash(strOut);
        //System.out.println(str1);
    }*/
}
