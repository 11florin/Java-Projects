public class Encapsulation {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7, -9);
        
        

        // System.out.println("r1 height: " + r1.getHeight());
        // System.out.println("r1 width: " + r1.getWidth());
        // System.out.println("r1 area: " + r1.getArea());
        // //System.out.println("r2 perimeter: " + ((2 * r1.getHeight()) + (2 * r1.getWidth())));
        // System.out.println("r1 perimeter: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(8, 4);

        System.out.println(r1.getHeight() + " , " + r1.getWidth());
        System.out.println(r2.getHeight() + " , " + r2.getWidth());
        
    }
}