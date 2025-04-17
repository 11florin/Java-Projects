public class Main {
    public static void main(String[] args) {
        displayShape(new Triangle());
    }
    static void displayShape(Shape shape) {
        System.out.println(shape.getName());
        shape.draw();
        System.out.println("Sides: " + shape.getSideCount());
    }
}