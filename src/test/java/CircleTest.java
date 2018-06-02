import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CircleTest {

        @Test
        public void setRadius() {
            Circle circleTest = new Circle();
            circleTest.setRadius(3.0);

            assertEquals(18.84, circleTest.getFerence(), 0.01);

            assertEquals(28.27, circleTest.getArea(), 0.01);

            assertEquals(3.0, circleTest.getRadius(), 0.01);
        }

    @Test
    public void setFerence() {
        Circle circleTest = new Circle();
        circleTest.setFerence(20.0);

        assertEquals(20.00, circleTest.getFerence(), 0.01);

        assertEquals(31.84, circleTest.getArea(), 0.01);

        assertEquals(3.18, circleTest.getRadius(), 0.01);
    }

    @Test
    public void setArea() {
        Circle circleTest = new Circle();
        circleTest.setArea(100.0);

        assertEquals(35.44, circleTest.getFerence(), 0.01);

        assertEquals(100, circleTest.getArea(), 0.01);

        assertEquals(5.64, circleTest.getRadius(), 0.01);
    }


    @Test
    public void getRadius() {
    }

    @Test
    public void getFerence() {
    }

    @Test
    public void getArea() {
    }
}