//Задание 3
public class posl {
    public static void main(String args[]) {
        String str = args[0];
        String[] subStr;
        String finalStr = "";
        subStr = str.split(",");
        for (int i = 0; i < subStr.length; i++) {
            if (subStr[i].contains("-")) {
                int index = subStr[i].indexOf("-");
                int a = Integer.parseInt(subStr[i].substring(0,index));
                int b = Integer.parseInt(subStr[i].substring(index+1));
                for (int j = a; j<=b; j++){
                    finalStr = finalStr.concat(j+",");
                }
            }
            else finalStr = finalStr.concat(subStr[i] + ",");
        }
        System.out.print(finalStr.substring(0, finalStr.length() -1));
    }
}

