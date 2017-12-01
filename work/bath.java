//Задача 6. Проект CircleDemo Бассейн
class bath  {

    public static void main(String[] args) {
        double Radius=3, deltaR=1, priceP=1000, priceF=2000;
        double costP, costF;
        Circle bath = new Circle();
        Circle path = new Circle();
        bath.setRad(Radius);
        path.setRad(Radius+deltaR);
        costP=(path.getAr()-bath.getAr())*priceP;
        costF=path.getFer()*priceF;
        System.out.println("Стоимость покрытия="+costP);
        System.out.println("Стоимость ограды="+costF);


    }


}
