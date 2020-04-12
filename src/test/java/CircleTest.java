import org.junit.Test;

import static org.junit.Assert.*;

 class CircleTest {
     double delta = 0.000000001;

    @Test
    void setRadius() {
        Circle earthAndRope = new Circle();
        earthAndRope.setRadius(6378.1*1000);
        assertEquals(4.007478420772212E7, earthAndRope.getFerence(), delta);
        assertEquals(1.2780049057763622E14, earthAndRope.getArea(), delta);
    }

    @Test
    void setFerence() {
        Circle swimmingPoolAndPath = new Circle();
        swimmingPoolAndPath.setFerence(18.84955592153876);
        assertEquals(3, swimmingPoolAndPath.getRadius(), delta);
        assertEquals(28.274333882308138,swimmingPoolAndPath.getArea(), delta);
    }

    @Test
    void setArea() {
        Circle swimmingPoolAndPath = new Circle();
        swimmingPoolAndPath.setArea(28.274333882308138);
        assertEquals(3, swimmingPoolAndPath.getRadius(), delta);
        assertEquals(18.84955592153876, swimmingPoolAndPath.getFerence(), delta);
    }
}
