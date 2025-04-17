public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive value";
        }
        
        int minutes = seconds / 60;
        return getDurationString(seconds / 60, seconds % 60);

        //two step approach
        //int minutes = seconds / 60;
        //int hours = minutes / 60;
        //System.out.println("hours =  " + hours);

        //one step approach
        // int hours1 = seconds / 3600;
        // System.out.println("hours1 = " + hours1);

        //int remainingMinutes = minutes % 60;
        //System.out.println("minutes = " + minutes);
        //System.out.println("remainingMinutes = " + remainingMinutes);
        
        //int remainingSeconds = seconds % 60;
        //System.out.println("remainingSeconds = " + remainingSeconds);

        //return getDurationString(minutes, seconds);


    }
    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
