import java.util.ArrayList;

public class Deployment {

    public static void main (String[] args)
    {
        String nums = new String();
        nums = args[0].toString();

        char[] characters = new char[100];
        //         System.out.println(nums);
               characters = nums.toCharArray();
      /*  for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }
       */ System.out.println();

        ArrayList deployed = new ArrayList();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '-'){
                deployed.add(characters[i]);
            }
            else {
                deployed.add(',');
                int j=1;
                double raskrmin=0;
                 do{
                    raskrmin = raskrmin + Character.getNumericValue(characters[i-j]) * Math.pow(10,j-1);
                    j++;
                }
                 while (i-j >= 0 && characters[i-j] != ',');

              //  System.out.println(raskrmin);

                 j=1;
                double raskmax=0;
                ArrayList<Integer> raskmax1 = new ArrayList();
                while (i+j <= characters.length-1 && characters[i+j] != ','  )
                {
                   raskmax1.add(Character.getNumericValue(characters[i+j]));
                   // raskmax= raskmax+ Character.getNumericValue(characters[i+j]) * Math.pow(10,j-1);
                    j++;
                }
                for (int k = raskmax1.size()-1; k >= 0 ; k--) {
                    raskmax = raskmax + raskmax1.get(k) * Math.pow(10,raskmax1.size()-k-1);

                }

             //   System.out.println(raskmax);


                double rask = raskrmin+1;
                while (rask<raskmax){
                    deployed.add((int) rask);
                    deployed.add(',');
                    rask++;
                }
            }
        }
        for (int i = 0; i < deployed.size() ; i++) {
            System.out.print(deployed.get(i));
        }
    }
}
