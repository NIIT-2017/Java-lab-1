public class Task4DiapasonContract {
    public static void main(String[] args){
        String inputString = "1,2,4,5,6,7,11,18,19,20,21,25,26";
        String charSeparator = ",";
        String charDiapason = "-";

        Contract object = new Contract(inputString, charSeparator, charDiapason);
        //System.out.println("Input string: " + object.startString); // println генерирует CRLF, поэтому заменён на print + \n
        System.out.print("Input string: " + object.startString + "\n");
        System.out.print("Output string: " + object.exchangeContract());
    }
}

class Contract {
    String startString;
    String finishString;
    String charSeparator;
    String charDiapason;

    Contract(String inputString, String charSeparator, String charDiapason){
        startString = inputString;
        finishString = "";
        this.charSeparator = charSeparator;
        this.charDiapason = charDiapason;
    }

    String exchangeContract(){
        boolean inDiapason = false; //признак нахождения в диапазоне
        int beginDiapason = 0; //начало диапазона
        int endDiapason = 0; //конец диапазона

        String stringParts[] = startString.split(this.charSeparator);
        for (int i = 1; i < stringParts.length; i++) {

            if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i-1]) == 1) && (inDiapason == false) && (i <= stringParts.length - 1) ) { // входим в диапазон
                inDiapason = true;
                beginDiapason = i - 1;
                finishString += stringParts[i-1];

                if (i == stringParts.length - 1)  // редкий случай конца строки, пример: ...9,11,12
                    finishString += this.charSeparator + stringParts[i]; // без изменений, не создаём диапазон м/у числами отличающимися на 1


            }

            else if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i-1]) == 1) && (inDiapason == true) && (i == stringParts.length - 1) ) { // заканчиваем строку и диапазон
                endDiapason = i;
                //inDiapason = false;

                if (endDiapason - beginDiapason > 1)
                    finishString += this.charDiapason + stringParts[i];


                else if (endDiapason - beginDiapason < 1)
                    finishString += this.charSeparator + stringParts[i];

            }

            else if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i-1]) > 1) && (inDiapason == true) && (i < stringParts.length - 1) ) { // заканчиваем диапазон, но продолжаем строку
                endDiapason = i - 1;
                inDiapason = false;

                if (endDiapason - beginDiapason > 1)
                    finishString += this.charDiapason + stringParts[i - 1] + this.charSeparator;


                else if (endDiapason - beginDiapason <= 1)  // не создаём диапазон м/у числами отличающимися на 1, или неправильно расположенными
                    finishString += this.charSeparator + stringParts[i - 1] + charSeparator;

            }

            else if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i - 1]) > 1) && (inDiapason == false)/* && (i < stringParts.length - 1) */) { // не в диапазоне, продолжаем строку
                finishString += stringParts[i - 1] + this.charSeparator;

                if (i == stringParts.length - 1)
                    finishString += stringParts[i];
            }

            else if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i - 1]) > 1) && (inDiapason == true) && (i == stringParts.length - 1) ) { // заканчиваем дипазон, и через один символ строку
                //inDiapason =false;
                endDiapason = i - 1;

                if (endDiapason - beginDiapason > 1)
                    finishString += this.charDiapason + stringParts[i - 1] + this.charSeparator;

                if (endDiapason - beginDiapason <= 1) // не создаём диапазон м/у числами отличающимися на 1, или неправильно расположенными
                    finishString += this.charSeparator + stringParts[i - 1] + charSeparator;

                    finishString += stringParts[i];
            }
        }
        return finishString;
    }

}

