public class Task6Circle {
    public static void main(String[] args){

       /*Земля и верёвка*/
        Circle Earth = new Circle(); // создаём Землю
        double earthRadius = 6378100; // радиус Земли в метрах (6378.1 км)
        Earth.setRadius(earthRadius);

        Circle Rope = new Circle(); // создаём верёвку
        //double ferenceRope = Earth.getFerence() + 1;
        Rope.setFerence(Earth.getFerence() + 1); // длинна верёвки, которая на метр длиннее окружности Земли

        System.out.printf("Зазор между Землёй и верёвкой %.2f метра(ов).\n", (Rope.getRadius() - earthRadius) ); // пример использования printf (например %10.2f: 10 знаков всего, и 2 после запятой)

        /*Бассеин*/
        Circle Pool = new Circle(); // создаём бассеин
        double poolRadius = 3; // радиус бассеина в метрах
        Pool.setRadius(poolRadius);

        Circle Fence = new Circle(); // зона огороженная забором
        Fence.setRadius(poolRadius + 1); // радиус на 1 метр больше радиуса бассеина
        System.out.printf("Стоимость дорожки вокруг бассеина %.2f рублей, стоимость забора %.2f рублей. Всё вместе будет стоить %.2f рублей.", (Fence.getArea() - Pool.getArea()) * 1000, Fence.getFerence() * 2000, (Fence.getArea() - Pool.getArea()) * 1000 + Fence.getFerence() * 2000 );
    }
}

class Circle {
    private double radius; // радиус круга
    private double ference; // длинна окружности
    private double area; // площадь круга

    public void setRadius(double radius) {
        this.radius = radius;
        this.ference = Math.PI * 2 * this.radius; // Math.PI - число ПИ
        this.area = Math.PI * Math.pow(this.radius, 2); // Math.pow - возведение в степень
        //this.area = Math.PI * this.radius * this.radius; // альтернативная запись
    }

    public double getRadius() {
        return this.radius;
    }

    public void setFerence(double ference) {
        this.ference = ference;
        this.radius = this.ference / (2 * Math.PI);
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public double getFerence() {
        return this.ference;
    }

    public void setArea(double area) {
        this.area = area;
        this.radius = Math.sqrt(this.area / Math.PI); // Math.sqrt - извлечение квадратного корня
        this.ference = Math.PI * 2 * this.radius;
    }

    public double getArea() {
        return this.area;
    }
}