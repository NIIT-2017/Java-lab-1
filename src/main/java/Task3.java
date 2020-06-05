import java.util.ArrayList;

public class Task3 {
    public static String table (String numbers){
        ArrayList list = new ArrayList();
        StringBuffer strBuffer = new StringBuffer();
        int num;
        int val_before;    // number before '-'
        int val_after;     // number after '-'
        int inNumber = 0;  // flag
        for (int i = 0; i < numbers.length(); i++){
            if((inNumber == 0) && (numbers.charAt(i) >= '0') && (numbers.charAt(i) <= '9')) {    //number entery
                inNumber = 1;
                strBuffer.append(numbers.charAt(i));    //add character to buffer
            }
            else if ((inNumber == 1) && (numbers.charAt(i) >= '0') && (numbers.charAt(i) <= '9'))   //move on number
                strBuffer.append(numbers.charAt(i));    //add character to buffer
            else if ((numbers.charAt(i) == ',') || (numbers.charAt(i) == '-')){   //end of number
                num = Integer.parseInt(strBuffer.toString());  //
                list.add(num);                                 //add number from buffer to ArrayList
                strBuffer.delete(0, strBuffer.length()); //for clear buffer
                inNumber = 0;
                if (numbers.charAt(i) == '-')   // for flag in ArrayList
                    list.add("-");
            }
        }
        if (inNumber == 1) {       //for the last number
            num = Integer.parseInt(strBuffer.toString());
            list.add(num);
        }
        for (int j = 0; j < list.size(); j++){   //work in ArrayList
            if (list.get(j) == "-"){
                val_before = (Integer) list.get(j-1);
                val_after = (Integer) list.get(j+1);
                list.remove(j);     //delete '-'
                while (val_before != (val_after-1))  //add numbers instead '-'
                    list.add(j,--val_after);     //remove() удалять со здвигом
            }
        }
        return list.toString();
    }

    public static void main(String[] args){
        //String[] arg = {"1 - 7, 17 - 21"};
        if (args[0].equals('\0'))
            return;
        else {
            String total_string = Task3.table(args[0]);
            for (int i = 1; i < total_string.length() - 1; i++)   // for delete '[' and ']'
                System.out.print(total_string.charAt(i));
        }
    }
}