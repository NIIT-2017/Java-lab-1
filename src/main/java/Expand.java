class Expand {

    public static void main(String[] args) {
        String str = args [0];
        //String str = "1,2,10,4-7,18-21";
        String strArr[] = str.split(",");
        String result = "";
        int i;
        for (i=0; i < strArr.length; i++) {
            if ((i != strArr.length) & (i != 0))  result += ",";
            if (strArr[i].contains("-")) {
                String range[] = strArr[i].split("-");
                for (int c = Integer.parseInt(range[0]); c <= Integer.parseInt(range[1]); c++) {
                    result += c;
                    if (c != Integer.parseInt(range[1])) result += ",";
                }
                continue;
            }
            result += strArr[i];
        }
        System.out.print (result);
    }
}
