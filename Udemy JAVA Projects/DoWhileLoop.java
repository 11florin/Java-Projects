import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String again;
        do{
        int num = ThreadLocalRandom.current().nextInt(1,7); //origin (first number) is included while the bound(second number) is excluded
        System.out.println("You rolled a "+ num + ".");
        System.out.print("Stop Roll  y/n: ");
        again = scanner.next();
        } while(!again.equals("y"));
        
    }
    
}
