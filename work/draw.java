//Задание 5
public class draw {
    public static void main (String [] args){
        String print = args[0];
        String [][] mass   = new String[10][7];

        mass [0][0] = ("   ***   ");
        mass [0][1] = ("  *   *  ");
        mass [0][2] = (" *     * ");
        mass [0][3] = (" *     * ");
        mass [0][4] = (" *     * ");
        mass [0][5] = ("  *   *  ");
        mass [0][6] = ("   ***   ");

        mass [1][0] = ("  *  ");
        mass [1][1] = (" **  ");
        mass [1][2] = ("  *  ");
        mass [1][3] = ("  *  ");
        mass [1][4] = ("  *  ");
        mass [1][5] = ("  *  ");
        mass [1][6] = (" *** ");

        mass [2][0] = ("  ***  ");
        mass [2][1] = (" *   * ");
        mass [2][2] = (" *  *  ");
        mass [2][3] = ("   *   ");
        mass [2][4] = ("  *    ");
        mass [2][5] = (" *     ");
        mass [2][6] = (" ***** ");

        mass [3][0] = ("  ***  ");
        mass [3][1] = ("     * ");
        mass [3][2] = ("     * ");
        mass [3][3] = ("  ***  ");
        mass [3][4] = ("     * ");
        mass [3][5] = ("     * ");
        mass [3][6] = ("  ***  ");

        mass [4][0] = ("    *  ");
        mass [4][1] = ("   **  ");
        mass [4][2] = ("  * *  ");
        mass [4][3] = (" *  *  ");
        mass [4][4] = (" ***** ");
        mass [4][5] = ("    *  ");
        mass [4][6] = ("    *  ");

        mass [5][0] = ("  **** ");
        mass [5][1] = ("  *    ");
        mass [5][2] = ("  *    ");
        mass [5][3] = ("  ***  ");
        mass [5][4] = ("     * ");
        mass [5][5] = ("     * ");
        mass [5][6] = ("  ***  ");

        mass [6][0] = (" ****  ");
        mass [6][1] = (" *     ");
        mass [6][2] = (" *     ");
        mass [6][3] = (" ****  ");
        mass [6][4] = (" *   * ");
        mass [6][5] = (" *   * ");
        mass [6][6] = (" ****  ");

        mass [7][0] = (" ***** ");
        mass [7][1] = ("     * ");
        mass [7][2] = ("    *  ");
        mass [7][3] = ("   *   ");
        mass [7][4] = ("  *    ");
        mass [7][5] = (" *     ");
        mass [7][6] = (" *     ");

        mass [8][0] = ("  ***  ");
        mass [8][1] = (" *   * ");
        mass [8][2] = (" *   * ");
        mass [8][3] = ("  ***  ");
        mass [8][4] = (" *   * ");
        mass [8][5] = (" *   * ");
        mass [8][6] = ("  ***  ");

        mass [9][0] = ("  **** ");
        mass [9][1] = (" *   * ");
        mass [9][2] = (" *   * ");
        mass [9][3] = ("  **** ");
        mass [9][4] = ("     * ");
        mass [9][5] = ("     * ");
        mass [9][6] = ("  **** ");

        for (int i = 0 ; i<7; i++){
            for (int j = 0; j < print.length(); j++) {
                int chislo = Character.getNumericValue(print.charAt(j));
                System.out.print(mass[chislo][i]);
            }
            System.out.print("\n");
        }

    }

}

