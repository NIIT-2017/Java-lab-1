import static org.junit.Assert.*;

public class CollatzTest
{
    @org.junit.Test
    public void collatz_1() {
        assertEquals(4,Collatz.collatz(1,0));
    }

    @org.junit.Test
    public void collatz_10() {
        assertEquals(7, Collatz.collatz(10,0));
    }

    @org.junit.Test
    public void collatz_100() {
        assertEquals(26, Collatz.collatz(100,0));
    }

    @org.junit.Test
    public void collatz_1_1000000() {
        int qmax = 1, q;
        for(int i=1; i <= 1000000; i++) {
            q = Collatz.collatz(i,0);
            if (q > qmax) qmax = q;
        }
        assertEquals(525, qmax);
    }

    @org.junit.Test
    public void collatz1tol_1() {
        assertEquals(4, Collatz.collatz1tol(1));
    }

    @org.junit.Test
    public void collatz1tol_10() {
        assertEquals(20, Collatz.collatz1tol(10));
    }

    @org.junit.Test
    public void collatz1tol_100() {
        assertEquals(119, Collatz.collatz1tol(100));
    }

    @org.junit.Test
    public void collatz1tol_837798() {
        assertEquals(509, Collatz.collatz1tol(837798));
    }

    @org.junit.Test
    public void collatz1tol_837799() {
        assertEquals(525, Collatz.collatz1tol(837799));
    }

    @org.junit.Test
    public void collatz1tol_1000000() {
        assertEquals(525, Collatz.collatz1tol(1000000));
    }
}