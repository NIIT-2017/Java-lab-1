public class Reduce {
    public static void main(String[] args) {
        String str = args [0];
        //String str = "1,2,4,5,6,7,18,19,20,21";
        String result = "";

        String strArr[] = str.split(",");
        int digArr[] = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            digArr[i] = Integer.parseInt(strArr[i]);
        }

        int start = digArr[0];
        int finish = 0;

        for (int i = 1; i < digArr.length; i++) {

            if (i == digArr.length - 1) {
                if (digArr[i] == digArr[i - 1] + 1) {
                    if (start == digArr[i] - 1) {
                        result += start + "," + digArr[i];
                    } else result += start + "-" + digArr[i];
                } else result += start + "-" + digArr[i - 1] + "," + digArr[i];
                break;
            }

            if (digArr[i] != digArr[i - 1] + 1) {
                result += start;
                finish = digArr[i - 1];

                if (start == finish) {
                    result += ",";
                } else {
                    if (start != finish - 1) result += "-" + finish + ",";
                    else result += "," + finish + ",";
                }
                start = digArr[i];
            }
        }
        System.out.print (result);
    }
}
