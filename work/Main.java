import java.lang.String;
import java.util.Arrays;


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
         int flag = 0;
         int knew=0;
         while (k != length) {
            knew=k;
             while ((ch_str[knew] != ',')&&(knew<length-1)) {
                 pattern += ch_str[knew];
                 knew++;
                 count++;
             }

            for (int i=0; i<pattern.length();i++) {
                if (pattern.charAt(i)=='-') {
                    flag = 1;
                }
            }

             if (flag == 1) {
                 int pat_len = pattern.length();
                 int k1 = 0;
                 char[] new_pattern = pattern.toCharArray();

                 String start = "";
                 int m = 1;
                 String finish = "";
                 while (k1 != pat_len) {
                     if (new_pattern[k1] != '-') {
                         if (m == 1) {
                             start += new_pattern[k1];
                         } else {
                             finish += new_pattern[k1];
                         }
                     } else {
                         m++;
                     }

                     k1++;
                 }
                 int st = Integer.parseInt(start);
                 int fin = Integer.parseInt(finish);
                 for (int i = st; i <= fin; i++) {
                     new_string += Integer.toString(i);
                     new_string += ',';
                 }
             } else {
                 new_string += pattern;
                 if (pattern!=""){
                 new_string += ',';}
             }
             k++;
             k+=count;
             knew=0;
             flag = 0;
             pattern = "";
             count=0;
         }
         int l=new_string.length();
         new_string=new_string.substring(0,l-1);
         return new_string;
     }
 }


