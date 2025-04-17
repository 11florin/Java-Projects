import java.util.Scanner;

public class ChallengeScannerEx2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Restaurant Bill Calculator\n");

        System.out.print("Enter bill total: £");
        double bill = input.nextDouble();

        System.out.print("Enter number of people: ");
        int people = input.nextInt();

        double eachPay = bill / people;

        System.out.printf("A bill of £%.2f split between "+people+ " people come to approximately £%.2f each ", bill, eachPay);
    }
}
