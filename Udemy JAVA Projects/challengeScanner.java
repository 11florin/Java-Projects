import java.util.Scanner;

public class challengeScanner {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = inputScanner.next();

        System.out.print("Age: ");
        int age = inputScanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = inputScanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + ". Your name is "+firstName.length() + " characters long.");
        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + age * 2 + " years old.");
       // System.out.println("Your name is " + firstName + " and you are " + age + " years old");
        System.out.printf("You have £%.2f on you and need £%.2f.", money, moneyNeeded);
    }
    
}
