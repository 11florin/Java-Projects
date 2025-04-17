import java.util.Scanner;

public class LexicalScope {

    public static void main(String[] args) {

        int numPets; //ony if declare outside globally
        //sometimes it is better to declare as variable -1
        if(true){
            Scanner scanner = new Scanner(System.in);

        System.out.println("Enter thr number of pets you own: ");
        numPets = scanner.nextInt();
    }
    System.out.println("you have " + numPets + " pets"); //can not use variable outside block unless is declared outside block
        }
    
}
