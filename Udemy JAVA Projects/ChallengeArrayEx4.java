import java.util.Scanner;

public class ChallengeArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foods = new String[3];
        System.out.println("Enter your top 5 favorite foods: ");

        for(int i = 0; i < foods.length; i++){
            System.out.println("Food " + (i + 1)+ ": ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("No more memory available");

        System.out.println("Your favorite foods are: ");
        for(int i = 0; i < foods.length; i++){
            System.out.println(" - " + foods[i]);
        }


    }
    
}
