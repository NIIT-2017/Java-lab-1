public class Lab1_3 {

    public static void main (String [] args){
  String str = "";
    int i=0,a,b,c,beg=0,end =0;
    String work_str1 = "";
     String work_str2 = "";
       char[] chArray = args[0].toCharArray();

       while (i<chArray.length){
            work_str1 = "";
            work_str2 = "";
            if(chArray[i] == '-'){

                for (int j=i;j>=0;j--){
                    if (chArray[j] == ','){
                        beg = j+1;
                        break;
                    }
                    else beg = 0;
                }
                for (int j=i;j<chArray.length;j++){
                    if (chArray[j] == ','){
                        end = j-1;
                       //System.out.println("end = "+end);
                        break;
                    }
                    end = chArray.length-1;
                }
                for (int j = beg;j<i;j++){
                    work_str1 = work_str1 + chArray[j];
                }
                for (int j =i+1;j<=end;j++){
                    work_str2 = work_str2 + chArray[j];
                }

                a = Integer.parseInt(work_str1);
                b = Integer.parseInt(work_str2);
                str = str+",";
                while (a<b-1){
                    a++;
                    str = str+a+",";
                }

                //System.out.println("work_str1 = "+(Integer.parseInt(work_str1)+1));
                //System.out.println("work_str1 = "+work_str1);
                //System.out.println("work_str2 = "+(work_str2+1));
                //System.out.println("work_str2 = "+work_str2);

            }
            else{
                if(i+1 < chArray.length ) {
                    str = str + chArray[i];
                }
                else {
                    str = str + chArray[i];
                }


            }
            i++;
            //System.out.println("str22 = " + str);
        }
        System.out.print(str);
       
    }

}
