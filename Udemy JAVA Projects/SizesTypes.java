import java.util.Scanner;

public class SizesTypes {
    public static void main(String[] args) {
        // double[] foo = {0.43, 9.9, 102.9, 85.0, 141.9, 96.1};
        // double[] bar = new double[3];

        // bar[0] = 11.1;
        // bar[1] = 12.1;
        // bar[2] = 13.1;

        // System.out.println(bar[1]);

        String[]prediction = new String[3];

        Scanner scanner = new Scanner(System.in);
        prediction[0] = "a pioneer";
        prediction[1] = "loved by many";
        prediction[2] = "very wealthy";

        System.out.println("I will predict your future: ");
        int choice = scanner.nextInt();

        System.out.println("In your future you will be " + prediction[choice - 1]);
    }
    
}
