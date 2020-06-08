import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle figure = new Circle();
    @Test
    public void getRadius() throws  Exception{
        figure.setRadius(6378.1, "km");
        double actual_r = figure.getRadius();
        double expected_r = 6378100;
        assertEquals(expected_r,actual_r,0);

        figure.setFerence(25.13274, "m");
        actual_r = figure.getRadius();
        expected_r = 4;
        assertEquals(expected_r,actual_r,0.00001);

        figure.setArea(28.27433, "m");
        actual_r = figure.getRadius();
        expected_r = 3;
        assertEquals(expected_r,actual_r,0.00001);
    }

    @Test
    public void getFerence() throws  Exception{
        figure.setRadius(6378.1, "km");
        double actual_f = figure.getFerence();
        double expected_f = 40074784.20772;
        assertEquals(expected_f,actual_f,0.00001);

        figure.setFerence(3, "km");
        actual_f = figure.getFerence();
        expected_f = 3000;
        assertEquals(expected_f,actual_f,0);

        figure.setArea(71.61972, "m");
        actual_f = figure.getFerence();
        expected_f = 30;
        assertEquals(expected_f,actual_f,0.00001);
    }

    @Test
    public void getArea() throws  Exception{
        figure.setRadius(6378.1,"km");
        double actual_a = figure.getArea();
        double expected_a = 127800490577636.2;
        assertEquals(expected_a,actual_a,0.1);

        figure.setFerence(15,"m");
        actual_a = figure.getArea();
        expected_a = 17.90493;
        assertEquals(expected_a,actual_a,0.00001);

        figure.setArea(4,"km");
        actual_a = figure.getArea();
        expected_a = 4000;
        assertEquals(expected_a,actual_a,0);
    }
}