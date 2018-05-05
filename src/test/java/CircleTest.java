import static org.junit.Assert.*;

public class CircleTest
{
    @org.junit.Test
    public void getParam_RADIUS() {
        Circle circTest = new Circle();
        assertEquals(0, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void getParam_FERENCE() {
        Circle circTest = new Circle();
        assertEquals(0, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void getParam_AREA() {
        Circle circTest = new Circle();
        assertEquals(0, circTest.getParam(Circle.ParamName.AREA),0);
    }


    @org.junit.Test
    public void setParam_RADIUS_1() {
        Circle circTest = new Circle();
        assertEquals(true, circTest.setParam(Circle.ParamName.RADIUS,1));
    }
    @org.junit.Test
    public void setParam_RADIUS_0() {
        Circle circTest = new Circle();
        assertEquals(false, circTest.setParam(Circle.ParamName.RADIUS,0));
    }
    @org.junit.Test
    public void setParam_FERENCE_10() {
        Circle circTest = new Circle();
        assertEquals(true, circTest.setParam(Circle.ParamName.FERENCE,10));
    }
    @org.junit.Test
    public void setParam_FERENCE_0() {
        Circle circTest = new Circle();
        assertEquals(false, circTest.setParam(Circle.ParamName.FERENCE,0));
    }
    @org.junit.Test
    public void setParam_AREA_100() {
        Circle circTest = new Circle();
        assertEquals(true, circTest.setParam(Circle.ParamName.AREA,100));
    }
    @org.junit.Test
    public void setParam_AREA__1() {
        Circle circTest = new Circle();
        assertEquals(false, circTest.setParam(Circle.ParamName.AREA,-1));
    }


    @org.junit.Test
    public void setParam_RADIUS_1_getParam_RADIUS() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.RADIUS,1);
        assertEquals(1, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void setParam_RADIUS__1_getParam_RADIUS() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.RADIUS,-1);
        assertEquals(0, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void setParam_RADIUS_1_getParam_FERENCE() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.RADIUS,1);
        assertEquals(6.28318, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void setParam_RADIUS__1_getParam_FERENCE() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.RADIUS,-1);
        assertEquals(0, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void setParam_RADIUS_1_getParam_AREA() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.RADIUS,1);
        assertEquals(3.14159, circTest.getParam(Circle.ParamName.AREA),0);
    }
    @org.junit.Test
    public void setParam_RADIUS__1_getParam_AREA() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.RADIUS,-1);
        assertEquals(0, circTest.getParam(Circle.ParamName.AREA),0);
    }


    @org.junit.Test
    public void setParam_FERENCE_628318_getParam_RADIUS() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.FERENCE,62.8318);
        assertEquals(10, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void setParam_FERENCE__10_getParam_RADIUS() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.FERENCE,-10);
        assertEquals(0, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void setParam_FERENCE_628318_getParam_FERENCE() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.FERENCE,62.8318);
        assertEquals(62.8318, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void setParam_FERENCE__100_getParam_FERENCE() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.FERENCE,-100);
        assertEquals(0, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void setParam_FERENCE_628318_getParam_AREA() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.FERENCE,62.8318);
        assertEquals(314.159, circTest.getParam(Circle.ParamName.AREA),0);
    }
    @org.junit.Test
    public void setParam_FERENCE__1000_getParam_AREA() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.FERENCE,-1000);
        assertEquals(0, circTest.getParam(Circle.ParamName.AREA),0);
    }


    @org.junit.Test
    public void setParam_AREA_314159_getParam_RADIUS() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.AREA,3.14159);
        assertEquals(1, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void setParam_AREA__1_getParam_RADIUS() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.AREA,-1);
        assertEquals(0, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void setParam_AREA_314159_getParam_FERENCE() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.AREA,3.14159);
        assertEquals(6.28318, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void setParam_AREA__1_getParam_FERENCE() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.AREA,-1);
        assertEquals(0, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void setParam_AREA_314159_getParam_AREA() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.AREA,3.14159);
        assertEquals(3.14159, circTest.getParam(Circle.ParamName.AREA),0);
    }
    @org.junit.Test
    public void setParam_AREA__1_getParam_AREA() {
        Circle circTest = new Circle();
        circTest.setParam(Circle.ParamName.AREA,-1);
        assertEquals(0, circTest.getParam(Circle.ParamName.AREA),0);
    }

    @org.junit.Test
    public void Circle_RADIUS_1_getParam_RADIUS() {
        Circle circTest = new Circle(Circle.ParamName.RADIUS, 1);
        assertEquals(1, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void Circle_RADIUS__1_getParam_RADIUS() {
        Circle circTest = new Circle(Circle.ParamName.RADIUS, -1);
        assertEquals(0, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void Circle_RADIUS_1_getParam_FERENCE() {
        Circle circTest = new Circle(Circle.ParamName.RADIUS, 1);
        assertEquals(6.28318, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void Circle_RADIUS__1_getParam_FERENCE() {
        Circle circTest = new Circle(Circle.ParamName.RADIUS, -1);
        assertEquals(0, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void Circle_RADIUS_1_getParam_AREA() {
        Circle circTest = new Circle(Circle.ParamName.RADIUS, 1);
        assertEquals(3.14159, circTest.getParam(Circle.ParamName.AREA),0);
    }
    @org.junit.Test
    public void Circle_RADIUS__1_getParam_AREA() {
        Circle circTest = new Circle(Circle.ParamName.RADIUS, -1);
        assertEquals(0, circTest.getParam(Circle.ParamName.AREA),0);
    }

    @org.junit.Test
    public void Circle_FERENCE_628318_getParam_RADIUS() {
        Circle circTest = new Circle(Circle.ParamName.FERENCE, 6.28318);
        assertEquals(1, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void Circle_FERENCE__1_getParam_RADIUS() {
        Circle circTest = new Circle(Circle.ParamName.FERENCE, -1);
        assertEquals(0, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void Circle_FERENCE_628318_getParam_FERENCE() {
        Circle circTest = new Circle(Circle.ParamName.FERENCE, 6.28318);
        assertEquals(6.28318, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void Circle_FERENCE__1_getParam_FERENCE() {
        Circle circTest = new Circle(Circle.ParamName.FERENCE, -1);
        assertEquals(0, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void Circle_FERENCE_628318_getParam_AREA() {
        Circle circTest = new Circle(Circle.ParamName.FERENCE, 6.28318);
        assertEquals(3.14159, circTest.getParam(Circle.ParamName.AREA),0);
    }
    @org.junit.Test
    public void Circle_FERENCE__1_getParam_AREA() {
        Circle circTest = new Circle(Circle.ParamName.FERENCE, -1);
        assertEquals(0, circTest.getParam(Circle.ParamName.AREA),0);
    }

    @org.junit.Test
    public void Circle_AREA_314159_getParam_RADIUS() {
        Circle circTest = new Circle(Circle.ParamName.AREA, 3.14159);
        assertEquals(1, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void Circle_AREA__1_getParam_RADIUS() {
        Circle circTest = new Circle(Circle.ParamName.AREA, -1);
        assertEquals(0, circTest.getParam(Circle.ParamName.RADIUS),0);
    }
    @org.junit.Test
    public void Circle_AREA_314159_getParam_FERENCE() {
        Circle circTest = new Circle(Circle.ParamName.AREA, 3.14159);
        assertEquals(6.28318, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void Circle_AREA__1_getParam_FERENCE() {
        Circle circTest = new Circle(Circle.ParamName.AREA, -1);
        assertEquals(0, circTest.getParam(Circle.ParamName.FERENCE),0);
    }
    @org.junit.Test
    public void Circle_AREA_314159_getParam_AREA() {
        Circle circTest = new Circle(Circle.ParamName.AREA, 3.14159);
        assertEquals(3.14159, circTest.getParam(Circle.ParamName.AREA),0);
    }
    @org.junit.Test
    public void Circle_AREA__1_getParam_AREA() {
        Circle circTest = new Circle(Circle.ParamName.AREA, -1);
        assertEquals(0, circTest.getParam(Circle.ParamName.AREA),0);
    }
}
