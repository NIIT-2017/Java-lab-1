class Circle {
    private double radius; // радиус
    private double ference; // длинна окружности
    private double area; // площадь круга

    public double getRadius() {return this.radius;}

    public double getFerence() {return this.ference;}

    public double getArea() {return this.area;}

    public void setRadius(double radius) { //при установке значения радиуса пересчитывать длину окружности и пощадь;
        this.radius = radius;
        this.ference = Math.PI * 2 * this.radius;
        this.area = Math.PI * this.radius * this.radius;
    }

    public void setFerence(double ference) { //при установке длины окружности пересчитывать радиус и площадь;
        this.ference = ference;
        this.radius = this.ference / (2 * Math.PI);
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public void setArea(double area) { //при установке площади пересчитывать радиус и длину окружности.
        this.area = area;
        this.radius = Math.sqrt(this.area / Math.PI);
        this.ference = Math.PI * 2 * this.radius;
    }
}

class CircleMain {
    public static void main(String[] args){

        //Земля и верёвка
        Circle Earth = new Circle();
        Earth.setRadius(6378100); // радиус Земли в метрах
        Circle Rope = new Circle();
        Rope.setFerence(Earth.getFerence() + 1);
        System.out.print("Зазор между Землёй и верёвкой" + (Rope.getRadius() - 6378100) + "m\n");

        //Бассеин
        Circle Pool = new Circle();
        //double poolRadius = 3; // радиус бассеина в метрах
        Pool.setRadius(3);

        Circle Zabor = new Circle(); // забор
        Zabor.setRadius(4); // 3 + 1
        System.out.print("Cтоимость материалов для бетонной дорожки вокруг круглого бассейна " +
                (Zabor.getArea() - Pool.getArea()) * 1000 + " рублей" + '\n' +
                "Cтоимость материалов ограды вокруг бассейна (вместе с дорожкой) " +
                ((Zabor.getArea() - Pool.getArea()) * 1000 + Zabor.getFerence() * 2000) + " рублей");
    }
}
