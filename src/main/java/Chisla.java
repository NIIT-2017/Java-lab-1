import java.lang.reflect.Array;
import java.util.ArrayList;

public class Chisla {
    public static String parseString(String array)
    {
        StringBuilder sb = new StringBuilder();
        String[] split = array.split(",");
        for (int i = 0; i < split.length; i++) {
            if (split[i].contains("-")) {
                String[] split2 = split[i].split("-");
                Integer a = Integer.parseInt(split2[0]);
                Integer b = Integer.parseInt(split2[1]);
                for (int j = a; j <= b; j++) {
                    sb.append(Integer.toString(j));
                    sb.append(",");
                }
                continue;
            }
            else
            {
                sb.append(split[i]);
                sb.append(",");
            }
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(parseString(args[0]));
    }
}

