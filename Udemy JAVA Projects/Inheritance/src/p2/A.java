package p2;
public class A {
    public int v1 = 5;
    protected int v2 = 10;//can be accessed by child class, can not be accessed from main
    int v3 = 15;//package-private accessed -- can only be accessed within the package or inherited
    private int v4 = 20;//can only be accessed within the class

    public void m1() {
        System.out.println("something");
    }
}
