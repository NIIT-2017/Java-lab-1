import java.util.ArrayList;

public class Task4 {

    public static String table(String numbers) {
        ArrayList list = new ArrayList();
        StringBuffer strBuffer = new StringBuffer();
        int num;
        int val_before;    // number before '-'
        int val_after;     // number after '-'
        int val_now;
        int inNumber = 0;  // flag
        int flag = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if ((inNumber == 0) && (numbers.charAt(i) >= '0') && (numbers.charAt(i) <= '9')) {    //number entery
                inNumber = 1;
                strBuffer.append(numbers.charAt(i));    //add character to buffer
            }
            else if ((inNumber == 1) && (numbers.charAt(i) >= '0') && (numbers.charAt(i) <= '9'))   //move on number
                strBuffer.append(numbers.charAt(i));    //add character to buffer
            else if ((numbers.charAt(i) == ',') || (numbers.charAt(i) == '-')) {   //end of number
                num = Integer.parseInt(strBuffer.toString());  //
                list.add(num);                                 //add number from buffer to ArrayList
                strBuffer.delete(0, strBuffer.length()); //for clear buffer
                inNumber = 0;
            }
        }
        if (inNumber == 1) {       //for the last number
            num = Integer.parseInt(strBuffer.toString());
            list.add(num);
        }
        strBuffer.delete(0,strBuffer.length());   //clear buffer
        strBuffer.append(list.get(0));            //add 1st nubmer to buffer
        for (int j = 1; j < list.size() - 1; j++){   //inside ArrayList
            val_before = (Integer) list.get(j - 1);
            val_now = (Integer) list.get(j);
            val_after = (Integer) list.get(j + 1);
            if ((val_now == val_before + 1) && (val_after == val_now + 1) && (flag == 0)) {   //start of progression
                flag = 1;
                strBuffer.append("-");
            }
            else if ((val_now == val_before + 1) && (val_after == val_now + 1) && (flag == 1))  //move on progression
                continue;
            else {     //for numbers
                if (flag == 0) //dont add ',' to strBuffer if end of progression
                    strBuffer.append(',');
                strBuffer.append(val_now);
                flag = 0;
            }
        }
        if ((flag == 0) && (list.size() > 1))  //if string has more 1 symbol. add ',' before the last symb
            strBuffer.append(',');
        if (list.size() > 1)                   //if string has more 1 symbol. add the last symb to strBuffer
            strBuffer.append(list.get(list.size()-1));
        return strBuffer.toString();
    }

    public static void main(String[] args){
        //String[] arg = { "3,   5 , 6 , 7 ,8"};  //for test
        if (args[0].equals('\0'))
            return;
        else {
            String total_string = Task4.table(args[0]);
            System.out.println(total_string);
        }
    }
}