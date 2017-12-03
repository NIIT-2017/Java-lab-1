import java.lang.String;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Main {

    public static void main(String[] args) {
        String str = args[0];
        //  System.out.println(str);
        str+=" ";
        String str1 = Processing(str);
        System.out.println(str1);
    }


    public static String Processing(String str) {
        int length = str.length();
        int k = 0;
        char[] ch_str = str.toCharArray();
        String pattern = "";
        String new_string = "";
        int count=0;
        int knew=0;
        int amount=0;
        List<Integer> list = new ArrayList<Integer>();


            while (k != length) {
            knew=k;
            while ((ch_str[knew] != ',')&&(knew<length-1)) {
                pattern += ch_str[knew];
                knew++;
                count++;
            }
            int value = Integer.parseInt(pattern);
            list.add(value);
            amount++;
            k++;
            k+=count;
            knew=0;
            pattern = "";
            count=0;
        }
        int counter=0;

        for (int i=0;i<amount-2;i++){
             int one=   list.get(i) ;
             int two=   list.get(i+1) ;
             int three= list.get(i+2) ;

             if ((two-one)==1){
                 if ((three-two)==1) {
                 new_string+= Integer.toString(one);
                 new_string+='-';
                 new_string+= Integer.toString(three);
                 int next=i+3;
                 i=i+3;
                    while(next<=amount) {
                        int next_elem = list.get(next);
                        counter=next;
                        if ((next_elem - three) == 1) {
                            int l = new_string.length();
                            new_string = new_string.substring(0, l - 2);
                            new_string += '-';
                            new_string += next_elem;


                        //    i++;
                        } else {
                            new_string += ',';
                            break;
                        }
                        next++;
                    }

                 }else
                 {

                 }
             }


        }

        if(counter==(amount-3)) {
            int one = list.get(counter);
            int two = list.get(counter + 1);
            int three = list.get(counter + 2);
            if ((two - one) == 1) {
                if ((three - two) == 1) {
            //        new_string += ',';
                    new_string += Integer.toString(one);
                    new_string += '-';
                    new_string += Integer.toString(three);
                } else {
                    while (counter != amount) {
                    int value1 = list.get(counter);
                        new_string += ',';
                        new_string += Integer.toString(value1);
                        counter++;
                    }
                }
            }
        }
        else
        {
            int l = new_string.length();
            new_string = new_string.substring(0, l - 1);

            while (counter != amount) {
                int value1 = list.get(counter);
                new_string += ',';
                new_string += Integer.toString(value1);
                counter++;

            }
        }





        return new_string;
    }
}

