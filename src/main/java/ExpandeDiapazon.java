import java.util.StringTokenizer;

/**
 * Created by khvostovai on 23.03.2018.
 */
public class ExpandeDiapazon {
    public static void main(String[] args) {
        if (args.length!=0)
            System.out.println(expDiapazon(args[0]));
        else System.out.println("Нет параметров, введите строку.");
    }
    public static String expDiapazon(String string) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        for (StringTokenizer tokenizer = new StringTokenizer(string,","); tokenizer.hasMoreTokens(); ) {
            //получить новую подстроку с разделителем ","
            str = tokenizer.nextToken();
            // проверка на диапазон
            int index = str.indexOf('-');
            //если не -1 то "-" в подстроке и это диапазон
            if (index!=-1){
                //найти начало диапазона
                int beg=Integer.parseInt(str.substring(0,index));
                //найти конец диапазона
                int end=Integer.parseInt(str.substring(index+1,str.length()));
                //дописать недостающих элементов в диапазон
                for (;beg<=end;beg++) stringBuffer.append(beg+",");
            //иначе это не диапазон значит оставить без изменений
            }else {
                stringBuffer.append(str+",");
            }
        }
        //удалить последнюю запятую
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        //вывести полученный результат
        return stringBuffer.toString();
    }
}
