public class Main {
    public static void main(String[] args) {
        int myVariable = 50; //myVariable = expression and statement is all
        myVariable++;
        myVariable--;

        System.out.println("This is test");
        System.out.println("This is" +
                "another" +
                "still more.");//valid
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);//valid

        if(myVariable == 0) {
            System.out.println("it is now zero");
        }
    }
}
