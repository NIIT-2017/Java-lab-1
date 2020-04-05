public class Earth {
    public static double earth(int radius)
    {
        Circle rope = new Circle();
        rope.setRadius(radius);
        Circle lrope = new Circle();
        lrope.setFerence(rope.getFerence()+1);
        return lrope.getRadius()-rope.getRadius();
    }
    public static void main(String[] args) {
        System.out.println("Разница составила - " + earth(63781000));
    }
}
