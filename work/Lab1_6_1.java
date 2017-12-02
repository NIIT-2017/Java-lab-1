public class Lab1_6_1 {
    //"Земля и верёвка"
    public static void main(String [] args){
        double R_Eath = 6378100;

        Circle c = new Circle();
        c.SetRadius(R_Eath);

        double Fer_new = c.GetFerence()+1;
        c.SetFerence(Fer_new);
        double R_new = c.GetRadius();

        
        System.out.println(R_new - R_Eath);

    }
}
