public class task3 {
    public static void main(String[] args) {
        System.out.println(Unfold(args[0]));
    }
    static String Unfold(String original){
        StringBuilder result = new StringBuilder(original);
        result.insert(0, ",");
        result.append(",");

        int dashPosition = result.indexOf("-");

        while (dashPosition != -1){
            int begin = result.lastIndexOf(",", dashPosition);
            int end = result.indexOf(",", dashPosition);
            int startNum = Integer.parseInt(result.substring(begin+1, dashPosition));
            int finishNum = Integer.parseInt(result.substring(dashPosition + 1, end));
            StringBuilder line = new StringBuilder();
            for (int i = startNum; i <= finishNum; i++){
                line.append(",");
                line.append(i);
            }
            result.replace(begin, end, line.toString());
            dashPosition = result.indexOf("-");
        }
        result.deleteCharAt(0);
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
