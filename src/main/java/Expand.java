public class Expand {
    public static void main(String[] args) {
        System.out.println("Origin string : " + args[0]);
        System.out.println("Expanded string : " + Editor.ExpandStr(args[0]));
    }
}

class Editor{

    public static String ExpandStr (String source){
        source = source.replaceAll("\\s","");
        String[] parsed = source.split(",");
        String expandedStr = "";
        for (String str : parsed) {
            if (str.matches("\\d+"))
                expandedStr += ("," + str);
            else if (str.matches("\\d+-\\d+")) {
                int begin = Integer.parseInt(str.substring(0, str.indexOf('-')));
                int end = Integer.parseInt(str.substring(str.indexOf('-') + 1));
                //is the diapason correct
                if (begin < end)
                    expandedStr += openDiapason(begin, end);
                else{
                    expandedStr = " [Error]\nInvalid unit \"" + str +"\"";
                    break;
                }
            }
            else{
                expandedStr = " [Error]\nInvalid unit \"" + str +"\"";
                break;
            }
        }
        if (!expandedStr.isEmpty())
            expandedStr = expandedStr.substring(1);
       return expandedStr;
    }

    //return string representation of expanded digit diapason
    private static String openDiapason(int begin, int end){
        String str = "";
        for (int i = begin; i <= end; i++)
            str += ("," + i);
        return str;
    }
}