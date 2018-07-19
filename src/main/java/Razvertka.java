class Razvertka{
    public static void main(String[] args){
        String inputStr = args[0];
        String zapyataya = ",";
        String tire = "-";

        razvertkastr stroka = new razvertkastr(inputStr, zapyataya, tire);
        System.out.print("Строка до развертки: " + stroka.inputStr + "\n");
        System.out.print("Строка после развертки: " + stroka.zamena());
    }
}

class razvertkastr {
    String inputStr;
    String finishString;
    String zapyataya;
    String tire;

    razvertkastr(String inputStr, String zapyataya, String tire){
        this.inputStr = inputStr;
        finishString = "";
        this.zapyataya = zapyataya;
        this.tire = tire;
    }

    String diapazon(int beginDiapason, int endDiapason){ // развертка
        int dashArray[] = new int[endDiapason - beginDiapason - 1];
        String dashString = "";

        for (int i = 0; i <= dashArray.length - 1; i++)
            dashArray[i] = beginDiapason + i + 1;

        for (int i = 0 ; i < dashArray.length; i++) {
            String tempString = Integer.toString(dashArray[i]);

            if (i < dashArray.length - 1){dashString += tempString + this.zapyataya;}
            else {dashString += tempString;}
        }
        return dashString;
    }

    String zamena(){
        int beginDiapason; // начало
        int endDiapason; // конец

        String stringParts[] = this.inputStr.split(this.zapyataya);
        for (int i = 0; i < stringParts.length; i++) // !!!!!
            while (stringParts[i].contains(this.tire)){
                String dashStringParts [] = stringParts[i].split(this.tire);
                beginDiapason = Integer.parseInt(dashStringParts[0]);
                endDiapason = Integer.parseInt(dashStringParts[1]);

                if (endDiapason - beginDiapason > 1)
                    stringParts[i] = dashStringParts[0] +
                            this.zapyataya + diapazon(beginDiapason, endDiapason) +
                            this.zapyataya + dashStringParts[1];

                else if (endDiapason - beginDiapason == 1)
                    stringParts[i] = dashStringParts[0] +
                            this.zapyataya +
                            dashStringParts[1]; // если числа идут подряд
            }

        for (int i = 0; i < stringParts.length; i++){
            if(i < (stringParts.length - 1)) {finishString += stringParts[i] + this.zapyataya;}
            else {finishString += stringParts[i];}
        }
        return finishString;
    }
}