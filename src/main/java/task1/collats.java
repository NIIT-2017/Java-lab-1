package task1;

public class collats {
    public static long metodCollats(long s) {
        if (s == 1)
            return 1;
        else if (s % 2 == 0)
            return 1 + metodCollats(s / 2);
        else
            return 1 + metodCollats(s * 3 + 1);
    }

    public static void main(String[] args) {
        long buf = 1, sim, sim_max = 0, i;

        for(i = 1; i <= 1000000; i++) {
            sim = metodCollats(i);
            if(sim > sim_max) {
                sim_max = sim;
                buf = i;
            }
        }
        System.out.println("Symbol is - "+ buf +"  have length is - " + sim_max );
    }
}
