import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to SuperFast Rollercoaster");
        System.out.print("Please enter your height in centimeters: ");
        int height  = input.nextInt();

        if(height > 130 && height < 210){
            System.out.println("Height accepted");
        }
        else{
            System.out.println("Sorry you do not meet the requirements");

        }

    }
    
}
