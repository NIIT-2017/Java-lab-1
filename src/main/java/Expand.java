import java.util.ArrayList;

public class Expand {

    public static ArrayList<Integer> expand(String stroka){
        String[] arrString = stroka.split("-");
        ArrayList<Integer> arrNamber = new ArrayList<Integer>();
        for (int i = 0; i < arrString.length; i++) {
            for (String str: arrString[i].split(",")) {
                arrNamber.add(new Integer(str));
            }
            if(i + 1 < arrString.length){
                String[] strNext = arrString[i + 1].split(",");
                for(int j = arrNamber.get(arrNamber.size() - 1) + 1; j < new Integer(strNext[0]); j++){
                    arrNamber.add(new Integer(j));
                }
            }
        }
        return arrNamber;
    }


    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Строка не передана!!!");
            return;
        }

        ArrayList arrNamber = expand(args[0]);
        for (int i = 0; i < arrNamber.size(); i++){
            System.out.print(arrNamber.get(i));
            if(i + 1 < arrNamber.size()){
                System.out.print(",");
            }
            else{
                System.out.print(".\n");
            }
        }
    }
}
