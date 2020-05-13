public class Chisla2 {
    public static String coagulation (String buf){
        StringBuilder sb = new StringBuilder(); // создаем строку, с возможностью расширения
        String[] split = buf.split(",");// разбиваем строку в аргументах на массив строк
        int count = 0;
        for (int i =1;i<split.length;i++){
            Integer dur = Integer.parseInt(split[i]);
            Integer prev = Integer.parseInt(split[i-1]);
            if (dur == prev+1) {
                if (i==split.length-1)
                {
                    sb.append(Integer.toString(prev-count));
                    sb.append("-");
                    sb.append(Integer.toString(dur));
                    break;
                }
                count++;
                continue;
            }
            else if (dur!= prev+1 && count!=0)
            {
                if (count<2)
                {
                    sb.append(Integer.toString(prev-count));
                    sb.append(",");
                    sb.append(Integer.toString(prev));
                    sb.append(",");
                    count = 0;
                    continue;
                }
                sb.append(Integer.toString(prev-count));
                sb.append("-");
                sb.append(Integer.toString(prev));
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
        System.out.println(coagulation(args[0]));
    }
}
