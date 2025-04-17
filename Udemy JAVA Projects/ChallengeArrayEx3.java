public class ChallengeArrayEx3 {
    public static void main(String[] args) {
        double[] doubleArray = new double[] {232.52, 258.25, 117.26, 225.52, 198.89};
        double sum = 0;

        for(int i = 0; i < doubleArray.length; i++){
            sum += doubleArray[i];
            //System.out.println(sum);
        }
        double avg = sum / doubleArray.length;

        System.out.print("Sum: "+ sum +"\n");
        System.out.print("The average: " + avg);
    }
    
}
