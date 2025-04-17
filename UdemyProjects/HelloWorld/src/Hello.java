public class Hello {

    public static void main(String[]args) {
//       System.out.println("Hello Florin");
//
//       boolean isAlien = false;
//       if (isAlien == false) {
//           System.out.println("It is not an alien");
//           System.out.println("And i am scared of aliens");
//       }
//
//       int topScore = 80;
//       if(topScore < 100) {
//           System.out.println("You got the high score!");
//       }
//
//       int secondTopScore = 81;
//       if((topScore > secondTopScore) && (topScore < 100)) {
//           System.out.println("Greater then second top score and less then 100");
//       }
//
//       if((topScore > 90) || (secondTopScore <= 90)) {
//           System.out.println("Either or both of the condition are true");
//       }
//
//       int newValue = 50;
//       if(newValue == 50) {
//           System.out.println("This is an error");
//       }
//
//       boolean isCar = false;
//       if (!isCar) {
//           System.out.println("This is not supposed to happen");
//       }
//
//       String makeOfCar = "Volkswagen";
//       boolean isdDomestic =makeOfCar == "Volkswagen" ? false : true;
//
//       if(isdDomestic) {
//           System.out.println("This car is domestic to our country?");
//       }
//
//       String s = (isdDomestic) ? "This car is domestic" : "This car is not domestic";
//       System.out.println(s);



        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValueTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("Total is " + myValueTotal);

        double totalRemainder = myValueTotal % 40.00;
        System.out.println("Total remainder is " +totalRemainder);

        boolean stepFour =  (totalRemainder == 0) ? true : false;
        System.out.println("Step four is " + stepFour);

        if (!stepFour) {
            System.out.println("Got some remainder");
        }

    }

}

