package WrapSeq;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Methods {
    static int razryv = 0;
    static ArrayList<Integer> helpArr = new ArrayList<Integer>();
    static ArrayList<Integer> lastCheckArr = new ArrayList<Integer>();

    public static String readWord() {
        System.out.println("Введите последовательность чисел");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (Exception ex) {
            ex.printStackTrace();
            return "чёт не получилось";
        }
    }

    public static ArrayList<Integer> wordToArrToInt(String a) {
        String[] splitMass = a.split(",");
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        for(String s : splitMass) {
            arrInt.add(Integer.parseInt(s));
            lastCheckArr.add(Integer.parseInt(s));
        }
        return arrInt;
    }

    public static boolean firstCheck(ArrayList<Integer> arr) {
        boolean check1 = false;
        for(int i = 1; i<arr.size();i++) {
            if((arr.get(i-1)-arr.get(i))== -1) {
                check1 = true;
            } else {check1 = false; razryv = arr.get(i); break;}
        }
        if(check1 == true) {
            //System.out.println("Разрыва нет");
            System.out.print(arr.get(0)+"-"+arr.get(arr.size()-1)+lastCheck(arr.get(arr.size()-1)));
        }else {
            //System.out.println("Обнаружен разрыв в точке "+razryv+"."+"\nПерехожу к следующей проверке");
        }
        return check1;
    }

    public static void deleteFirstSeq(ArrayList<Integer> arr) {
        int indexOfRazryv = arr.indexOf(razryv);
        for(int i = 0;i<indexOfRazryv;i++) {
            helpArr.add(arr.get(i));
        }
        //System.out.println(helpArr);
        arr.removeAll(helpArr);
        //helpArr.clear();

    }

    public static boolean checkSize(ArrayList<Integer> arr) {
        if (arr.size() == 1 || arr.size() == 2) {
            if (arr.size() == 1) {
                System.out.print(arr.get(0)+lastCheck(arr.get(0))); return true;
            } else if (arr.size() == 2) {
                System.out.print(arr.get(0) + "," + arr.get(1)+lastCheck(arr.get(1))); return true;
            }
        }
        return false;

    }

    public static String lastCheck(int z) {
        if(z==lastCheckArr.get(lastCheckArr.size()-1)) {
            return ".";
        }
        else return ",";
    }

}
