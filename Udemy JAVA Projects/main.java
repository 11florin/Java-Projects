import java.util.Scanner;

public class main {
    public static void main(String[]args){

        //System.out.println(4.5 - 2.7);
        //System.out.printf("I have %.1f cats, %d dogs, and 1 %s ", 7.9, 2, "panther");
        //System.out.printf("When formatted: %.2f ", 4.5 - 2.7);



        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String userName = input.next();
        System.out.println(userName + " is a nice name");

        System.out.println("\nHow old are you? ");
        int age = input.nextInt();
        System.out.println("Your name is "+ userName+ " and you are " + age + " years old");

        System.out.println("How tall are you? ");
        double userHeigh = input.nextDouble();
        System.out.println("You are "+ userHeigh + " meters tall!");

        double averageMaleHeighDifference = userHeigh - 1.75;
        double averageFemaleHeighDifference = userHeigh - 1.62;
        System.out.println("\nThe difference between your heigh and the average is: ");
        System.out.printf("%.2fm if you are a male.\n", averageMaleHeighDifference);
        System.out.printf("%.2fm if you are female.", averageFemaleHeighDifference);
    }
}