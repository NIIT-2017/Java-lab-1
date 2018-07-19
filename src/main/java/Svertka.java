class Svertka {
    public static void main(String[] args){
        String inputStr = args[0];
        String zapyataya = ",";
        String tire = "-";

        svertkastr strokastr = new svertkastr(inputStr, zapyataya, tire);
        System.out.print("Строка до свертки: " + strokastr.inputStr + "\n");
        System.out.print("Строка после свертки: " + strokastr.diapazonsv());
    }
}

class svertkastr {
    String inputStr;
    String finishString;
    String zapyataya;
    String tire;

    svertkastr(String inputStr, String zapyataya, String tire){
        this.inputStr = inputStr;
        finishString = "";
        this.zapyataya = zapyataya;
        this.tire = tire;
    }

    String diapazonsv(){
        boolean inDiapason = false; //флаг
        int beginDiapason = 0; //начало диапазона
        int endDiapason = 0; //конец диапазона

        String stringParts[] = this.inputStr.split(this.zapyataya);
        for (int i = 1; i < stringParts.length; i++) {

            if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i-1]) == 1) &&
                    (inDiapason == false) &&
                    (i <= stringParts.length - 1) ) // вошли в диапазон
            {
                inDiapason = true;
                beginDiapason = i - 1;
                finishString += stringParts[i-1];

                if (i == stringParts.length - 1) {finishString += this.zapyataya + stringParts[i];} // если диапазон в конце строки
            }

            else if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i-1]) == 1) &&
                    (inDiapason == true) &&
                    (i == stringParts.length - 1) )  // конец строки
            {
                endDiapason = i;

                if (endDiapason - beginDiapason > 1) {finishString += this.tire + stringParts[i];}

                else if (endDiapason - beginDiapason < 1) {finishString += this.zapyataya + stringParts[i];}
            }

            else if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i-1]) > 1) &&
                    (inDiapason == true) &&
                    (i < stringParts.length - 1) ) // конец диапазона и продолжение строки
            {
                endDiapason = i - 1;
                inDiapason = false;

                if (endDiapason - beginDiapason > 1) {finishString += this.tire + stringParts[i - 1] + this.zapyataya;}

                else if (endDiapason - beginDiapason <= 1) {finishString += this.zapyataya + stringParts[i - 1] + zapyataya;} // если отличие меньше, чем 1
            }

            else if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i - 1]) > 1) &&
                    (inDiapason == false)) // вышли из диапазона, строка продолжается
            {
                finishString += stringParts[i - 1] + this.zapyataya;

                if (i == stringParts.length - 1) {finishString += stringParts[i];}
            }

            else if ( (Integer.parseInt(stringParts[i]) - Integer.parseInt(stringParts[i - 1]) > 1) &&
                    (inDiapason == true) &&
                    (i == stringParts.length - 1) ) // заканчиваем дипазон, и через один символ строку
            {
                endDiapason = i - 1;

                if (endDiapason - beginDiapason > 1) {finishString += this.tire + stringParts[i - 1] + this.zapyataya;}

                if (endDiapason - beginDiapason <= 1) {finishString += this.zapyataya + stringParts[i - 1] + zapyataya;}
                // если отличие меньше, чем 1
                finishString += stringParts[i];
            }
        }
        return finishString;
    }

}

