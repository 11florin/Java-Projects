import java.util.Scanner;
public class GuestList {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        insertTestNames();

        do {
            displayGuests();

            displayMenu();

            int option = getOption();

            // if(option == 1) {
            //     System.out.println("------------------------------\n -Guests- \n");
            //     for(int i = 0; i < guests.length; i++) {
            //         // if (guests[i] == null) {
            //         //     System.out.println("--");
            //         // }
            //         // else {
            //         //     System.out.println(guests[i]);
            //         // }
            //         System.out.println(guests[i] == null ? "--" : guests[i]);
            //         //condition ? a : b;
            //         //String s = true? "chedar" : "gouda"; //chedar
            //         //String s = false? "chedar" : "gouda"; //gouda
            //         //System.out.println(false ? "chedar" : gouda);
            //     }
            //}
            if (option == 1) {
                addGuests();
            }
            else if (option == 2) {
                insertGuest();
            }
            else if (option == 3) {
                renameGuest();
            }
            else if (option == 4) {
                removeGuests();
            }
            else if (option == 5) {
                System.out.println("Exiting...");
                break;
            }
        }while (true);
    }
    static void displayGuests() {
        System.out.println("------------------------------\n -Guests- \n");
        boolean isEmpty = true;
                for(int i = 0; i < guests.length; i++) {
                    // if (guests[i] == null) {
                    //     System.out.println("--");
                    // }
                    // else {
                    //     System.out.println(guests[i]);
                    // }
                    if (guests[i] != null) {
                        System.out.println((i + 1) + ". "+ guests[i]);
                        isEmpty = false;
                    //condition ? a : b;
                    //String s = true? "chedar" : "gouda"; //chedar
                    //String s = false? "chedar" : "gouda"; //gouda
                    //System.out.println(false ? "chedar" : gouda);
                    }
                }
                if (isEmpty) {
                    System.out.println("Guest list is empty");
                }
    }
    static void displayMenu() {
        System.out.println("------------------------------\n -Menu- \n");
            System.out.println("1 - Add Guest");
            System.out.println("2 - Insert Guest");
            System.out.println("3 - Rename Guest");
            System.out.println("4 - Remove Guest");
            System.out.println("5 - Exit");
            
    }
    static int getOption() {
        System.out.print("Option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            return option;
    }
    static void addGuests(){
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }
    static void insertGuest() {
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >= 1 && num <= 10 && guests[num - 1] != null) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            for (int i = guests.length - 1; i > num - 1; i--) {
                guests[i] = guests[i - 1];
            }
            guests[num - 1] = name;
        }
        else {
            System.out.println("\nError: There is no guest with that number");
        }
    }
    static void renameGuest() {
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >= 1 && num <= 10  && guests[num - 1] != null) {
            System.out.print("Name: ");
            String name = scanner.nextLine();

            guests[num - 1] = name;
        }
        else {
            System.out.println("\nError: There is no guest with that number");
        }
    }
    static void removeGuests() {
        System.out.print("Number: ");
                int num = scanner.nextInt();
                if (num >= 1 && num <= 10  && guests[num - 1] != null){
                    guests[num - 1] = null;
                
                // for (int i = 0; i < guests.length; i++) {
                //     if (guests[i] != null && guests[i].equals(name)) {
                //         guests[i] = null;
                //         break;
                //     }
                //}
                String[] temp = new String[guests.length];//this will replace the null elements or --
                int ti = 0;
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] != null) {
                        temp[ti] = guests[i];
                        ti++;
                    }
                }
                guests = temp; //this will replace the null elements or --
            }
            else {
                System.out.println("\nError: There is no guest with that number");
            }
    }
    
    static void insertTestNames() {
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";
    }
}