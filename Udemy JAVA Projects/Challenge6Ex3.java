import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;

public class Challenge6Ex3 {
    public static void main(String[] args) {
        System.out.println("\n#### Guess my number Game ####\n");

        System.out.println("------Rules------");
        System.out.println("Think of a number from 1 to 100 and i'll try to guess it.");
        System.out.println("Enter \"higher\" if my guess is to low.");
        System.out.println("Enter \"lower\" if my guess is to high.");
        System.out.println("Enter \"correct\" if i will get it right");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;
        int guess = 50; //from step 4

        while (true) {
            //int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("\nI guess " + guess + "."); //guess all over replace randomNumber
            System.out.println("Your response: ");
            input = scanner.next();

            if(input.equals("higher")) {
                min = guess + 1;
            } else if (input.equals("lower")) {
                max = guess - 1;
            }else if(input.equals("correct")) {
                System.out.println("\n" + guess + ", eh? I knew I'd get it eventually.");
                break;
            }
            guess = (min + max) / 2; //no need of randomNumber
            //This if statement check to see if it's still possible to win
            //Example: The program guesses 28, you enter "higher" then the program guesses 29, you enter "lower"
            if(min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
                guess = 50;
            }
        }
    }
    
}
