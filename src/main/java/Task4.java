import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static String ComeBack(String st) {
        String Empty = ""; // ищю конец строки
        String NSt[] = st.split(","); // убираю запятые
        for (int i=0; i < NSt.length; i++) { // проверяю все элементы в новой строке
            int j=0;
            while( i+j< NSt.length && Integer.parseInt(NSt[i])+j == Integer.parseInt(NSt[i+j]) )
                j++;
            j--;
            if (j>1){
                Empty = Empty.concat(NSt[i]+"-"+NSt[i+j] + ","); //Добавить строку к другой строке
                i+=j;
            }
            else {
                Empty = Empty.concat(NSt[i] + ",");
            }
        }
        Empty = Empty.substring(0, Empty.length() - 1); // отсоединяю строку
        return Empty;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter interval numbers: ");
        String st = in.nextLine();
        ComeBack(st);
        System.out.println(ComeBack(st));
    }
}


