public class RangesAndNums {

    static String RangesToNums (String in) {
        String out = "";
        String buf[] = in.split(",");
        for (int i = 0; i < buf.length; i++) {
            if (buf[i].contains("-")) {
                String temp[] = buf[i].split("-");
                int prev = Integer.parseInt(temp[0]);
                int next = Integer.parseInt(temp[1]);
                while (prev <= next) {
                    out += Integer.toString(prev++) + ",";
                }
            } else {
                out += buf[i] + ",";
            }
        }
        out = out.replaceAll(",$", "\0");
        return out;
    }

    static String NumsToRanges (String in) {
        String out = "";
        String str[] = in.split(",");
        int buf[] = new int[str.length];

        for (int i=0;i<str.length;i++) {
            buf[i] = Integer.parseInt(str[i]);
        } //парсим массив символов в массив чисел

        for (int i=0;i<buf.length;i++) {

            if (i == buf.length-1) {
                out += Integer.toString(buf[i]) + "\0";
                break;
            } // проверка на достижение конца массива

            int temp1 = buf[i];
            int temp2 = buf[i+1];

            if (temp2-temp1 == 1) {
                while ((i + 1) < buf.length && buf[i+1] - buf[i] == 1) {
                    temp2 = buf[++i];
                }
                if (temp2 - temp1 == 1) {
                    out += Integer.toString(temp1)+","+Integer.toString(temp2)+",";
                } else {
                    out += Integer.toString(temp1)+"-"+Integer.toString(temp2)+",";
                }
            } else {
                out += Integer.toString(buf[i])+",";
            }
        }
        out = out.replaceAll(",$", "\0");
        return out;
    }
}
