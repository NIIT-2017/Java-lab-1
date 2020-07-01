public class Collatz {
        public static long metodCollatz(long l) {
            if (l == 1)
                return 1;
            else if (l % 2 == 0)
                return 1 + metodCollatz(l / 2);
            else
                return 1 + metodCollatz(l * 3 + 1);
        }

        public static void main(String[] args) {
            long start_number = 1, sim, sim_max = 0, i;

            for(i = 1; i <= 1000000; i++) {
                sim = metodCollatz(i);
                if(sim > sim_max) {
                    sim_max = sim;
                    start_number = i;
                }
            }
            System.out.println(start_number+" "+ sim_max );
        }

}
