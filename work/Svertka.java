import java.util.ArrayList;

public class Svertka {

    public static void main (String[] args){
        char[] chars = new char[1000];
        chars = args[0].toCharArray();
        for (char ch: chars             ) {
         //   System.out.print(ch);
        }
       // System.out.println();
        ArrayList<Integer> arrayList = new ArrayList();
        int k =1;

        for (int i = chars.length-1; i >= 0 ; i=i-k-1) {
            double num = 0;

            for (int j = 0; i-j >= 0 && chars[i-j] != ','; j++) {
               num = num + Character.getNumericValue(chars[i-j])*Math.pow(10,(double) j);
                k = j+1;

            }
         //   System.out.print("k= " + k + " ");
          //  System.out.print(num + " ");
            arrayList.add((int) num);
        }
       // System.out.println();

        for (int i: arrayList
             ) {
         //   System.out.print(i + " ");
        }

        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            ints.add(arrayList.get(i));

        }
       // System.out.println();

        for (int i: ints
             ) {
         //   System.out.print(i + ",");
        }
       // System.out.println();
        ArrayList<Integer> svernums = new ArrayList<Integer>();
        svernums.add(ints.get(0));
        for (int i = 1; i < ints.size()-1 ; i++) {
            if (ints.get(i)-ints.get(i-1) == 1 && ints.get(i+1)-ints.get(i) == 1 ) {
                svernums.add(-ints.get(i));
            }
            else svernums.add(ints.get(i));
        }
        svernums.add(ints.get(ints.size()-1));
        for (int i = 0; i <svernums.size() ; i++) {
       //     System.out.print(svernums.get(i) + " ");
        }
       // System.out.println();

        for (int i = 0; i < svernums.size()-1; i++) {
            if (svernums.get(i)>0)
                System.out.print(svernums.get(i));
            if (svernums.get(i)>0 && svernums.get(i+1)>0)
                System.out.print(",");
            if (svernums.get(i)>0 && svernums.get(i+1)<0)
                System.out.print("-");

        }

        System.out.print(svernums.get(svernums.size()-1));
    }
}
