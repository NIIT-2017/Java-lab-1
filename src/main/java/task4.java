public class task4 {
    public static String svertka (String buf){
        StringBuilder sb = new StringBuilder();
        String[] split = buf.split(",");
        int count = 0;
        for (int i =1;i<split.length;i++){
            Integer a = Integer.parseInt(split[i]);
            Integer b = Integer.parseInt(split[i-1]);
            if (a == b+1) {
                if (i==split.length-1)
                {
                    sb.append(Integer.toString(b-count));
                    sb.append("-");
                    sb.append(Integer.toString(a));
                    break;
                }
                count++;
                continue;
            }
            else if (a!= b+1 && count!=0)
            {
                if (count<2)
                {
                    sb.append(Integer.toString(b-count));
                    sb.append(",");
                    sb.append(Integer.toString(b));
                    sb.append(",");
                    count = 0;
                    continue;
                }
                sb.append(Integer.toString(b-count));
                sb.append("-");
                sb.append(Integer.toString(b));
                sb.append(",");
                count = 0;
            }
            else {
                sb.append(split[i-1]);
                sb.append(",");
            }
        }
        if (!sb.toString().contains(split[split.length-1])) {
            sb.append(split[split.length-1]);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "1,2,3,4,5"; //
        System.out.println(svertka(str)); //
    }
}
