public class task3 {

    public static String parseString(String line){
        int i=0;
        StringBuilder sb = new StringBuilder();
        while (i<line.length()){

            int pos1 = line.indexOf('-', i);
            int pos2 = line.indexOf(',', i);
            if ((pos2 < pos1 && pos2!=-1) || (pos1 == -1 && pos2 > 0)) {
                String str=line.substring(i, pos2);
                int num = Integer.parseInt(str);
                sb.append(num+",");
                i=pos2+1;
            } else if ((pos1 < pos2 && pos1!=-1)||(pos2 == -1 && pos1 > 0)){
                String str1 = line.substring(i, pos1);
                int temp=line.indexOf(',', pos1+1);
                if(temp == -1)
                    temp = line.length();
                String str2 = line.substring(pos1+1, temp);
                int j1 = Integer.parseInt(str1);
                int j2 = Integer.parseInt(str2);
                for(int j=j1; j<j2; j++){
                    sb.append(j+",");
                }
                i=temp+1;
                if(i>=line.length()){
                    sb.append(j2);
                } else {
                    sb.append(j2+",");
                }
            } else if (pos1 == -1 && pos2 == -1){
                String str3 = line.substring(i, line.length());
                sb.append(str3);
                i=line.length();

            }
        }
        String result = sb.toString();
        return result;
    }

    public static void main(String[] args){
        int i = 0;
        if(args.length == 0)
            return;
        String result = parseString(args[0]);
        System.out.println(parseString(args[0]));

    }
}
