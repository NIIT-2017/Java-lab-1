public class Lab1_4 {
    public static void main (String [] args){

          String str = "";
          String str1 = "";
          int a = 0,i = 0,k = 0,l = 0;
          String strArr[] = args[0].split(",");
          int numArr[] = new int[strArr.length];
          // заполняем массив чисел
          for (int j = 0; j < strArr.length; j++) {
              numArr[j] = Integer.parseInt(strArr[j]);
              //System.out.print(numArr[j]);
          }
          //работаем с массивом
         while (i < numArr.length){
             k = 0;
             a = numArr[i];
             while ( (i+1 <numArr.length) && (Math.abs(numArr[i] - numArr[i+1]) == 1)) {
                 i++;
                 k++;
             }

             if (k == 0) {
                 if (i+1 == numArr.length){
                     str = str+numArr[i];
                 }
                 else {
                     str = str+numArr[i]+',';
                 }
                 i++;
             }
             else {
                 str = str+a+'-';
             }

         }
        System.out.print(str);
    }

}
