public class Lab1_6_2 {
    //"Земля и верёвка"
    public static void main(String [] args){
        double C_bet = 1000; //руб/кв метр
        double C_ogr = 2000; //руб/ пог метр
        double R_swim = 3; //метр
        double L_dor = 1; //метр

        Circle c = new Circle();
        c.SetRadius(R_swim);
        double S_swim = c.GetArea();

        c.SetRadius(R_swim+L_dor);
        double S_n = c.GetArea();
        double F_d = c.GetFerence();


        //System.out.println("Стоимость бетона = "+(S_n - S_swim)*C_bet+" рублей");
        //System.out.println("Стоимость ограды = "+F_d*C_ogr+" рублей");
        System.out.println("Cost_of_concrete = "+(S_n - S_swim)*C_bet+"RUB");
        System.out.println("Cost_of_fence = "+F_d*C_ogr+"RUB");


    }
}
