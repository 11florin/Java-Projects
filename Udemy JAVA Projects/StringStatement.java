import java.util.Scanner;

public class StringStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP lounge");
        System.out.print("Age: ");
        int age = scanner.nextInt();

        

        if(age >=18){
            System.out.print("Do you have a VIP Pass yes/no: ");
            String vipPassReply = scanner.next();

            if(vipPassReply.equals("yes") || age >=70){
                System.out.println("Thanks go on in");
            }
            else{
                System.out.println("Sorry you must either be over 70 or have a VIP Pass.");
            }
        }
        else{
            System.out.println("Sorry you must be over 18");
        }

        // if (age >=70 || (age >=18 && vipPassReply.equals("yes"))) {
        //     System.out.println("Thanks go on in");
        // }
        // else{
        //     System.out.println("Sorry no can do");
        // }
    }
    
    
}
