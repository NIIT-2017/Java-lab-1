import java.util.ArrayList;

 public class Reduce {

    //Метод преобразует строку содержащую числа в ArrayList
    public static ArrayList<Integer> strToArrInteger(String strInput) {
        ArrayList<Integer> arrInputNumber = new ArrayList<Integer>();
        String[] arrStrInput = strInput.split(",");
        for (String strBuf : arrStrInput) {
            arrInputNumber.add(Integer.valueOf(strBuf));
        }
        return arrInputNumber;
    }

    //Метод возращает индекс последнего элемента списка алгебраической последовательности
    private static int counter(ArrayList<Integer> arrayListInput, int indexStart){
        int indexEnd;
        int sizeArrayListInput = arrayListInput.size();
        for(indexEnd = indexStart + 1; indexEnd < sizeArrayListInput; indexEnd++){
            if(arrayListInput.get(indexEnd - 1) != arrayListInput.get(indexEnd) - 1){
                break;
            }
        }
        return indexEnd - 1;
    }

    public static String reduce(ArrayList<Integer> arrayListInputInteger) {
        String strOut = new String();
        for (int i = 0; i < arrayListInputInteger.size(); i++) {
            strOut += arrayListInputInteger.get(i).toString();
            if (i + 2 < arrayListInputInteger.size()) {
                if ((arrayListInputInteger.get(i) == (arrayListInputInteger.get(i + 1) - 1)) && ((arrayListInputInteger.get(i + 1) - 1) == arrayListInputInteger.get(i + 2) - 2)) {
                    strOut += "-";
                    i = counter(arrayListInputInteger, i);
                    if(i + 1 < arrayListInputInteger.size()) {
                        strOut += arrayListInputInteger.get(i).toString() + ",";
                    }else{
                        strOut += arrayListInputInteger.get(i).toString() + ".";
                    }
                }else{
                    strOut += ",";
                }

            }else if (i + 1 == arrayListInputInteger.size()){
                strOut += ".";
            }
            else{
                strOut += ",";
            }
        }
        return strOut;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Строка не передана!!!");
            return;
        }
        ArrayList <Integer> arrInputInteger = strToArrInteger(args[0]);
        String strOutput = reduce(arrInputInteger);
        System.out.print(strOutput + "\n");
    }

}