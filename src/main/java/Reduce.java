import java.util.ArrayList;

public class Reduce {
    public static String reduce(String strInput) {
        ArrayList<Integer> arrInputNumber = new ArrayList<Integer>();
        String[] arrStrInput = strInput.split(",");
        String strOut = new String();
        for (String strBuf : arrStrInput) {
            arrInputNumber.add(Integer.valueOf(strBuf));
        }
        for (int i = 0; i < arrInputNumber.size(); i++) {
            strOut += arrInputNumber.get(i).toString() + ",";

            if (((i + 2 != arrInputNumber.size()) && arrInputNumber.get(i) == (arrInputNumber.get(i+1) + 1)) && ((arrInputNumber.get(i+1) + 1) == arrInputNumber.get(i+2) + 2)) {
                strOut += "-";
                for (int j = i + 1; j + 1 < arrInputNumber.size() && arrInputNumber.get(j) == arrInputNumber.get(j + 1) + 1; i++, j++) {}
                strOut += arrInputNumber.get(i).toString() + ",";
                i++;
            }

        }
        strOut += ".";
        return strOut;

    }





    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Строка не передана!!!");
            return;
        }

        String strOutput = reduce(args[0]);
        System.out.println(strOutput);
    }
}
