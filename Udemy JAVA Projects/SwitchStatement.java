import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch(num){
            case 1:
            System.out.println("you entered one");
            break;
            case 2:
            System.out.println("you entered two");
            break;
            case 3:
            System.out.println("you enterd three");
            break;
            default:
            System.out.println("invalid numbers");
            break; //not necessary but better for future change
        }
    }
    
}
