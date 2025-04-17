import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class ChallengeWhileEx5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int guess;
        int randomNumbers = ThreadLocalRandom.current().nextInt(1, 101);
        int countGuess = 0;

        System.out.println("------------Guess my Number -------------");

        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            countGuess++;

            if(guess > randomNumbers){
                System.out.println("Lower");
            }
            else if(guess < randomNumbers){
                System.out.println("Higher");
            }
            else{
                System.out.println("Correct. My number was " + randomNumbers+ ".");
                System.out.println("You got it in "+countGuess+" guesses");
            }
        }while(guess !=  randomNumbers);
    }
    
}
