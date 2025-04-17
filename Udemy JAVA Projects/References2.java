public class References2 {
    public static int x = 5; //it can be accesses by  y  because it is global declared

    public static void main(String[] args) {
        System.out.println(x);
        foo();
        bar();
    }
    public static void foo(){ //no need to start with int as is declared with static int globally
        System.out.println(x);
        x = 10;
    }
    public static void bar(){
        System.out.println(x);
    }
    
}
