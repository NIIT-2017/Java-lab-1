import java.util.regex.Pattern;
import java.util.ArrayList;

public class task4 {
    private static StringBuilder result;
    private static ArrayList<Integer> buffer;

    public static void main(String[] args) {
        System.out.println(Fold(args[0]));
    }

    static String Fold(String original){
        Pattern pattern = Pattern.compile("[,]");
        String[] numbers = pattern.split(original);

        int previous = -2;
        int current;
        buffer = new ArrayList<Integer>();
        result = new StringBuilder();

        for (String num:numbers
        ) {
            current = Integer.parseInt(num);

            if(current != previous+1 & buffer.size() != 0)
                BufferCleaning();

            buffer.add(current);
            previous = current;
        }
        BufferCleaning();
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
    private static void BufferCleaning(){
        if(buffer.size() < 3 ){
            for (int temp:buffer
            ) {
                result.append(temp);
                result.append(",");
            }
        }
        else {
            result.append(buffer.get(0));
            result.append("-");
            result.append(buffer.get(buffer.size()-1));
            result.append(",");
        }
        buffer = new ArrayList<Integer>();
    }
}
