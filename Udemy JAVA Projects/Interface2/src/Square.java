public class Square implements Shape {

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public int getSideCount() {
        return 4;
    }

    @Override
    public void draw() {
        System.out.println("------------------");
        System.out.println("|                |");
        System.out.println("|                |");
        System.out.println("|                |");
        System.out.println("------------------");
    }
    
}
