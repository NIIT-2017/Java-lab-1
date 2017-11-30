//123456789

public class Transform {

    public static String transstr (int a, int b){

//                //а номер строки
//                //b номер цифры

        String[] one = new String[13];
             one[0] = "_*_";
             one[1] = "**_";
             one[2] = "_*_";
             one[3] = "_*_";
             one[4] = "_*_";
             one[5] = "_*_";
             one[6] = "***";

        String[] two = new String[13];
              two[0] = "_***_";
              two[1] = "*___*";
              two[2] = "___*_";
              two[3] = "__*__";
              two[4] = "_*___";
              two[5] = "*____";
              two[6] = "*****";

        String[] three = new String[13];
              three[0] = "_***_";
              three[1] = "*___*";
              three[2] = "____*";
              three[3] = "_***_";
              three[4] = "____*";
              three[5] = "*___*";
              three[6] = "_***_";

        String[] four = new String[13];
              four[0] = "___*__";
              four[1] = "__**__";
              four[2] = "_*_*__";
              four[3] = "*__*__";
              four[4] = "******";
              four[5] = "___*__";
              four[6] = "___*__";

        String[] five = new String[13];
              five[0] = "*****";
              five[1] = "*____";
              five[2] = "*____";
              five[3] = "****_";
              five[4] = "____*";
              five[5] = "*___*";
              five[6] = "_***_";

        String[] six = new String[13];
              six[0] = "_***_";
              six[1] = "*___*";
              six[2] = "*____";
              six[3] = "****_";
              six[4] = "*___*";
              six[5] = "*___*";
              six[6] = "_***_";

        String[] seven = new String[13];
              seven[0] = "*****";
              seven[1] = "____*";
              seven[2] = "___*_";
              seven[3] = "__*__";
              seven[4] = "_*___";
              seven[5] = "*____";
              seven[6] = "*____";

        String[] eight = new String[13];
              eight[0] = "_***_";
              eight[1] = "*___*";
              eight[2] = "*___*";
              eight[3] = "_***_";
              eight[4] = "*___*";
              eight[5] = "*___*";
              eight[6] = "_***_";

        String[] nine = new String[13];
              nine[0] = "_****";
              nine[1] = "*___*";
              nine[2] = "*___*";
              nine[3] = "_****";
              nine[4] = "____*";
              nine[5] = "____*";
              nine[6] = "____*";

        String[] zero = new String[13];
              zero[0] = "__***__";
              zero[1] = "_*___*_";
              zero[2] = "*_____*";
              zero[3] = "*_____*";
              zero[4] = "*_____*";
              zero[5] = "_*___*_";
              zero[6] = "__***__";

       //b - число, а - номер строки
        if(b == 0) return zero[a];
        else if(b == 1) return one[a];
        else if(b == 2) return two[a];
        else if(b == 3) return three[a];
        else if(b == 4) return four[a];
        else if(b == 5) return five[a];
        else if(b == 6) return six[a];
        else if(b == 7) return seven[a];
        else if(b == 8) return eight[a];
        else return nine[a];
    }
}
