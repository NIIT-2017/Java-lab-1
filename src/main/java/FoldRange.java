public class FoldRange
{
    public static String[] splitCom(String str) {
        return str.split(",");
    }
    public static int pars(String str) {
        return Integer.parseInt(str);
    }
    public static String fold(String[] strArr) {
        String strRes = ("");
        for(int k=0; k < strArr.length; k++) {
            int cur = k;
            if (k > 0) strRes += ",";
            strRes += strArr[cur];
            while((k + 1 < strArr.length) && (pars(strArr[k+1]) - pars(strArr[k]) == 1)) k++;
            if (cur != k) strRes += "-" + strArr[k];
        }
        return strRes;
    }
    public static String strRes(String string) {
        return fold(splitCom(string));
    }
}
