import java.util.Scanner;

public class Scanner2 {
    public static void main(String[]args){
        Scanner scannerInput = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scannerInput.nextLine();
        //String lastName = scannerInput.next();
        System.out.println("Your name is " + name);
    }
}
