public class Task6 {

    public static void main(String[] args) {
            circle earth = new circle();
            earth.setRadius(6378.1); //km
            circle rope = new circle();
            rope.setFerence(earth.getFerence()+0.001);
            double gap = (rope.getRadius()-earth.getRadius())* 1000; //m
            System.out.printf("The clearance between the ground and the rope is " + gap + " m\n");

            circle pool = new circle();
            circle track = new circle();
            pool.setRadius(3);
            track.setRadius(pool.getRadius()+1);
            double cost = track.getFerence()*2000+(track.getArea()-pool.getArea())*1000;
            System.out.printf("The cost of a track with a fence is " + cost + " rub\n");
        }
    }

    class circle {
        private double radius;
        private double ference;
        private double area;

        public double getRadius() {
            return radius;
        }

        public double getFerence() {
            return ference;
        }

        public double getArea() {
            return area;
        }

        public void setRadius(double radius) {
            this.radius = radius;
            ference = 2 * Math.PI * this.radius;
            area = Math.PI * Math.pow(this.radius, 2);
        }

        public void setFerence(double ference) {
            this.ference = ference;
            radius = this.ference / (2 * Math.PI);
            area = Math.PI * Math.pow(this.radius, 2);
        }

        public void setArea(double area) {
            this.area = area;
            this.radius = Math.sqrt(this.area / Math.PI);
            ference = 2 * Math.PI * this.radius;
        }
    }




