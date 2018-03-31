import java.util.ArrayList;

public class Expand {

    public static ArrayList expand(String stroka){
        String[] arrString = stroka.split("-");
        ArrayList<Integer> arrNaber = new ArrayList<Integer>();
        for (int i = 0; i < arrString.length; i++) {
            for (String str: arrString[i].split(",")) {
                arrNaber.add(new Integer(str));
            }
            if(i + 1 < arrString.length){
                String[] strNext = arrString[i + 1].split(",");
                for(int j = arrNaber.get(arrNaber.size() - 1) + 1; j < new Integer(strNext[0]); j++){
                    arrNaber.add(new Integer(j));
                }
            }
        }
        return arrNaber;
    }


    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Строка не передана!!!");
            return;
        }

        ArrayList arrNaber = expand(args[0]);
        for (int i = 0; i < arrNaber.size(); i++){
            System.out.print(arrNaber.get(i));
            if(i + 1 < arrNaber.size()){
                System.out.print(",");
            }
            else{
                System.out.print(".\n");
            }
        }
    }
}
