import static org.junit.Assert.*;

public class TestNums {
    @org.junit.Test
    public void changer() {
        String num = "  *    ***   ***     *  *****   *   *****  ***   ***    ***  \n" +
                     " **   *   * *   *   **  *      *        * *   * *   *  *   * \n" +
                     "* *      *      *  * *  *     *        *  *   * *   * *     *\n" +
                     "  *     *     **  *  *  ****  ****    *    ***   **** *     *\n" +
                     "  *    *        * *****     * *   *  *    *   *     * *     *\n" +
                     "  *   *     *   *    *  *   * *   * *     *   *    *   *   * \n" +
                     "***** *****  ***     *   ***   ***  *      ***    *     ***  \n";
        Nums numsTest = new Nums();
        assertEquals(num, numsTest.changer("1234567890"));
    }
}
