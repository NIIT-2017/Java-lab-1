class Expand {
    String num="";

    public String expand(String str) {
        String[] numbers = str.split(",");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].contains("-")) {
                String[] arr = numbers[i].split("-");
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[1]);
                numbers[i] = arr[1];
                for (int j = a; j < b; j++)
                    num=num+j+ ",";
            }
            num=num+ numbers[i];
            if (i != numbers.length - 1)
                num =num+ ",";
        }
        return num;
    }

    public static void main(String[] args){
        String str = args[0];
        Expand outputString = new Expand();
        System.out.println(outputString.expand(str));
    }
}

