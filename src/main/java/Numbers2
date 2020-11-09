import java.util.regex.Pattern;
import java.util.ArrayList;

public class Numbers2 {
    private static StringBuilder total;
    private static ArrayList<Integer> buf;

    public static void main(String[] args) {
        System.out.println(UnWrapping("1,2,4,5,6,7,18,19,20,21"));
    }

    static String UnWrapping(String original){
        Pattern pattern = Pattern.compile("[,]");
        String[] numbers = pattern.split(original);

        int prev = -2;
        int curr;
        buf = new ArrayList<Integer>();
        total = new StringBuilder();

        for (String num:numbers
        ) {
            curr = Integer.parseInt(num);

            if(curr != prev+1 & buf.size() != 0)
                BufferCleaning();

            buf.add(curr);
            prev = curr;
        }
        BufferCleaning();
        total.deleteCharAt(total.length()-1);
        return total.toString();
    }
    private static void BufferCleaning(){
        if(buf.size() < 3 ){
            for (int temp:buf) {
                total.append(temp);
                total.append(",");
            }
        }
        else {
            total.append(buf.get(0));
            total.append("-");
            total.append(buf.get(buf.size()-1));
            total.append(",");
        }
        buf = new ArrayList<Integer>();
    }
}
