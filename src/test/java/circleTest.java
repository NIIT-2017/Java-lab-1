import static org.junit.jupiter.api.Assertions.*;

class circleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        circle testCircle = new circle();
        testCircle.setFerence(30);
        assertEquals(4.7746482927568605, testCircle.getRadius());

    }
}