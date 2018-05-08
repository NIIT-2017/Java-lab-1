public class DeployRange
{
    public static String[] splitCom(String str) {
        return str.split(",");
    }
    public static String[] splitHyp(String str) {
        return str.split("-");
    }
    public static int pars(String str) {
        return Integer.parseInt(str);
    }
    public static String toStr(int num) {
        return Integer.toString(num);
    }
    public static int guessArrLength(String[] strArr) {
        String[] temp = splitHyp(strArr[strArr.length-1]);
        return pars(temp[temp.length-1]) + 1;
    }
    public static String deploy(String[] strArr) {
        int[] arr = new int[guessArrLength(strArr)];
        String strRes = ("");
        int i, j = 0, cur, count, k;
        for(i=0; i < strArr.length; i++) {
            cur = j;
            for(String val: splitHyp(strArr[i])) arr[j++] = pars(val);
            if (i > 0) strRes += ",";
            strRes += toStr(arr[cur]);
            if (j - cur == 2) {
                count = arr[j-1] - arr[cur];
                for(k=1; k <= count; k++) {
                    arr[cur+k] = arr[cur] + k;
                    strRes += "," + toStr(arr[cur+k]);
                }
                j = cur + count + 1;
            }
        }
        return(strRes);
    }
    public static String strRes(String string) {
        return deploy(splitCom(string));
    }
    public static String[] strArrRes(String string) {
        return splitCom(strRes(string));
    }
}
