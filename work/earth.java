//Задача 6. Проект CircleDemo Земля и веревка
class Earth  {
    public static void main(String[] args) {
        double Radius, deltaR;
        Radius=6378.1;
        Circle earth = new Circle();
        earth.setRad(Radius);
        earth.setFer(earth.getFer()+1);
        deltaR=earth.getRad()-Radius;
        System.out.println("Расстояние между поверхностью Земли и веревкой= "+ deltaR + " м");
    }
}
