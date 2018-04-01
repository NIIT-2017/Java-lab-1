import java.util.StringTokenizer;

/**
 * Created by khvostovai on 22.03.2018.
 */
public class MinimizeDiapazon {
    public static void main(String[] args) {
        //развернуть имеющиеся диапазоны и отправить для сворачивания
        System.out.println(minDiapazon(ExpandeDiapazon.expDiapazon(args[0])));
    }
    public static String minDiapazon(String str){
        int counter=-1;
        StringBuffer stringBuffer= new StringBuffer();
        for (StringTokenizer tokenizer = new StringTokenizer(str,","); tokenizer.hasMoreTokens(); ) {
            //разбираем с разделителем ","
            int num = Integer.parseInt(tokenizer.nextToken());
            //если строка результата пустая то это первый элемент, добавим его
            if (stringBuffer.length()==0){
                stringBuffer.append(num);
                //сохранить число для предположения следующего элемента
                counter= num;
            }else{
                //если элемент не совпадает с ожиданием
                if (num!=counter){
                    //не то что ожидаем, добавляем "-", предидущий элемент, "," и текущий элемент
                    stringBuffer.append("-" + (--counter) + "," + num);
                    //пересохраняем для дальнейших предположений
                    counter = num;
                }
                else if (!tokenizer.hasMoreElements()) stringBuffer.append("-"+num);
            }
            counter++;
        }
        return stringBuffer.toString();
    }
}
