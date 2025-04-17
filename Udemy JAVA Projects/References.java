public class References {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        int[] x = {3, 23, 4, 16, 8}; //y = x = contain the address of x is not copied as variable does
        int[] d = foo(x);
        d[4] = 35;
        //int[] y = x; //both array are linked together
        //y[0] = 20;
       // x[3] = 9;
        //int[] y = new int [5];

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //System.out.println("-------------");

        for(int i = 0; i < x.length; i++){
            System.out.println("x[" + i + "] = "+ x[i]);
        }
        // System.out.println("-----------------");
        // for(int i = 0; i < y.length; i++){
        //     System.out.println("y["+ i +"] = " + y[i]);
        // }
    }
    public static int[] foo(int[] c) {
        c[1] = 50;
        return c;
    }
    
}
