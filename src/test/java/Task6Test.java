import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task6Test {

    Task6 task6=new Task6();

    @org.junit.Test
    public void checkPaymentFerenceFromR() {
        double ferCanBe = 18.84955592153876;
        task6.paymentFerenceArea(3.0);
        double ferResult=task6.getCircumference();

        assertEquals(ferCanBe,ferResult);
    }

    @org.junit.Test
    public void checkPaymentAreaFromR() {
        double areaCanBe = 28.274333882308138;
        task6.paymentFerenceArea(3.0);
        double areaResult=task6.getArea();

        assertEquals(areaCanBe,areaResult);
    }

    @org.junit.Test
   public void checkPaymentRadiusFromFerence() {
        double radiusCanBe = 4.3767609350271215;
        task6.paymentRadiusArea(27.5);
        double radiusResult=task6.getRadius();

        assertEquals(radiusCanBe,radiusResult);
    }

    @org.junit.Test
    public void checkPaymentAreaFromFerence() {
        double areaCanBe = 60.18046285662291;
        task6.paymentRadiusArea(27.5);
        double areaResult=task6.getArea();

        assertEquals(areaCanBe,areaResult);
    }

    @org.junit.Test
    public void paymentRadiusFromArea() {
        double radiusCanBe = 6.0011316088819395;
        task6.paymentRadiusFerence(113.14);
        double radiusResult=task6.getRadius();

        assertEquals(radiusCanBe,radiusResult);
    }

    @org.junit.Test
    public void paymentFerenceFromArea() {
        double ferCanBe = 37.70622195137799;
        task6.paymentRadiusFerence(113.14);
        double ferResult=task6.getCircumference();

        assertEquals(ferCanBe,ferResult);
    }
}