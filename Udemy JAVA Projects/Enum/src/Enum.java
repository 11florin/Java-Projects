public class Enum {
    public static void main(String[] args) {
        whichSeason(Month.AUGUST);
        whichSeason(Month.SEPTEMBER);
        whichSeason(Month.MARCH);
        whichSeason(Month.MAY);
        whichSeason(Month.DECEMBER);
        whichSeason(Month.OCTOBER);

    }
    public static void whichSeason(Month month) {
        switch (month) {
            case DECEMBER, JANUARY, FEBRUARY:
            // case :
            // case :
            System.out.printf("%s is the winter season\n", month);
            break;
            case MARCH, APRIL, MAY:
            // case :
            // case :
            System.out.printf("%s is the spring season\n", month);
            break;
            case JUNE, JULY, AUGUST:
            // case :
            // case :
            System.out.printf("%s is the summer season\n", month);
            break;
            case SEPTEMBER, OCTOBER, NOVEMBER:
            // case :
            // case :
            System.out.printf("%s is the autumn season\n", month);
            break;
        }
    }
    public static void whichSeason(int month) {
        switch (month) {
            case 1:
            System.out.println("January is in the winter season");
            break;
            case 2:
            System.out.println("February is in the winter season");
            break;
            case 3:
            System.out.println("March is in the spring season");
            break;
            case 4:
            System.out.println("April is in the spring season");
            break;
            case 5:
            System.out.println("May is in the spring season");
            break;
            case 6:
            System.out.println("June is in the summer season");
            break;
            case 7:
            System.out.println("July is in the summer season");
            break;
            case 8:
            System.out.println("August is in the summer season");
            break;
            case 9:
            System.out.println("September is in the autumn season");
            break;
            case 10:
            System.out.println("October is in the Autumn season");
            break;
            case 11:
            System.out.println("November is in the autumn season");
            break;
            case 12:
            System.out.println("December is in the winter season");
            break;
            default:
            System.out.printf("%d is an invalid month ", month);
        }
    }
}