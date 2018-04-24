public class Task3DiapasonExpand {
    public static void main(String[] args){
        String inputString = "1,2,4-7,18-21";
        String charSeparator = ",";
        String charDiapason = "-";

        Expand object = new Expand(inputString, charSeparator, charDiapason);
        //System.out.println("Input string: " + object.startString); // println генерирует CRLF, поэтому заменён на print + \n
        System.out.print("Input string: " + object.startString + "\n");
        System.out.print("Output string: " + object.exchangeExpand());
    }
}

class Expand {
    String startString;
    String finishString;
    String charSeparator;
    String charDiapason;

    Expand(String inputString, String charSeparator, String charDiapason){
        startString = inputString;
        finishString = "";
        this.charSeparator = charSeparator;
        this.charDiapason = charDiapason;
    }

    String insteadOfDash(int beginDiapason, int endDiapason){
        int dashArray[] = new int[endDiapason - beginDiapason - 1];
        String dashString = "";

        for (int i = 0; i <= dashArray.length - 1; i++)
            dashArray[i] = beginDiapason + i + 1;

        for (int i = 0 ; i < dashArray.length; i++) {
            String tempString = Integer.toString(dashArray[i]);

            if (i < dashArray.length - 1)
                dashString += tempString + this.charSeparator;
            else
                dashString += tempString;
        }
        return dashString;
    }

    String exchangeExpand(){
        int beginDiapason; // начало диапазона
        int endDiapason; // конец диапазона

        String stringParts[] = startString.split(this.charSeparator);
        for (int i = 0; i < stringParts.length; i++) // !!!!!
            while (stringParts[i].indexOf(this.charDiapason) != -1){
                String dashStringParts [] = stringParts[i].split(this.charDiapason);
                beginDiapason = Integer.parseInt(dashStringParts[0]);
                endDiapason = Integer.parseInt(dashStringParts[1]);

                if (endDiapason - beginDiapason > 1)
                stringParts[i] = dashStringParts[0] + this.charSeparator + insteadOfDash(beginDiapason, endDiapason) + this.charSeparator + dashStringParts[1];

                else if (endDiapason - beginDiapason == 1)
                    stringParts[i] = dashStringParts[0] + this.charSeparator + dashStringParts[1]; // в случае, к примеру 1-2,...

            }

       /* for (String temp: stringParts  // альтернативный вариант
             ) {
            finishString += temp + this.charSeparator;
        }
        finishString = finishString.substring(0, finishString.length() - 1); // убираем последний разделитель */

       for (int i = 0; i < stringParts.length; i++){
           if(i < (stringParts.length - 1))
               finishString += stringParts[i] + this.charSeparator;
           else
               finishString += stringParts[i];
       }
        return finishString;
    }
}