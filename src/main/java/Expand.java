public class Expand {
    public static void main(String[] args){
        expand(args[0]);
    }
    public static String expand(String toExpand){
        String expanded = "";
        String[] collapsedArray = toExpand.split(",");
        for (int i = 0; i < collapsedArray.length; i++){
            if (collapsedArray[i].contains("-")){
                String[] toadd = collapsedArray[i].split("-");
                for (int k = Integer.parseInt(toadd[0]); k <= Integer.parseInt(toadd[1]); k++){
                    expanded = expanded + k + ",";
                }
            }
            else expanded = expanded + collapsedArray[i] + ",";
        }
        return(expanded.substring(0, expanded.length() - 1));
    }
}
