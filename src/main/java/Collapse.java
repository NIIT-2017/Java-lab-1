import java.util.ArrayList;

public class Collapse {
    public static void main(String[] args) {
        System.out.println("Origin string : " + args[0]);
        System.out.println("Expanded string : " + Redactor.CollapseStr(args[0]));
    }
}

class Redactor{

    private static ArrayList<Integer> buf = new ArrayList<>();
    private static String collapsedStr;

    public static String CollapseStr(String source){
        source = source.replaceAll("\\s","");
        String[] parsed = source.split(",");
        collapsedStr = "";
        for (String str : parsed) {
            if (!str.matches("\\d+")){
                flush();
                collapsedStr = " [Error]\nInvalid unit : '" + str + "'";
                break;
            }
            analyse(Integer.parseInt(str));
        }
        flush();
        if (!collapsedStr.isEmpty())
            collapsedStr = collapsedStr.substring(1);

        return collapsedStr;
    }

    //Recognize digit diapason
    private static void analyse(int number){
        if (buf.isEmpty())
            buf.add(number);
        else if (number - buf.get(buf.size() - 1) == 1){
            if (buf.size() == 1)
                buf.add(number);
            else
                buf.set(1, number);
        }
        else{
            flush();
            buf.add(number);
        }
    }

    //return content of "buf"
    private static void flush(){
        if (!buf.isEmpty()){
            if (buf.size() == 1)
                collapsedStr += "," + buf.get(0);
            else
                collapsedStr += closeDiapason(buf.get(0), buf.get(1));
            buf.clear();
        }
    }

    //form string representation of a digit diapason
    private static String closeDiapason(int begin, int end){
        return "," + begin + ((end - begin > 1) ? "-" : ",") + end;
    }
}
