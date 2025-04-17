import java.util.Scanner;

public class ChallengeWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String pass;

        do{
            System.out.println("Enter your password: ");
            pass = scanner.next();
        }while(!pass.equals("shark50"));
        System.out.println("Access Approved");
    }
    
}
