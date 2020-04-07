import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class CircleTest {

    @Test
    void setRadius() {
        Circle earthAndRope = new Circle();
        earthAndRope.setRadius(6378.1*1000);
        assertEquals(4.007478420772212E7, earthAndRope.getFerence());
        assertEquals(1.2780049057763622E14, earthAndRope.getArea());
    }

    @Test
    void setFerence() {
        Circle swimmingPoolAndPath = new Circle();
        swimmingPoolAndPath.setFerence(18.84955592153876);
        assertEquals(3, swimmingPoolAndPath.getRadius());
        assertEquals(28.274333882308138,swimmingPoolAndPath.getArea());
    }

    @Test
    void setArea() {
        Circle swimmingPoolAndPath = new Circle();
        swimmingPoolAndPath.setArea(28.274333882308138);
        assertEquals(3, swimmingPoolAndPath.getRadius());
        assertEquals(18.84955592153876, swimmingPoolAndPath.getFerence());
    }
}
