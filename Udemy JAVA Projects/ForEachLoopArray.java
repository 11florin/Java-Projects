public class ForEachLoopArray {
    public static void main(String[] args) {
        double[] da = new double[] {25.92, 1.34, -76.24, 833.11, 76.084};
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus"};


        for(String e : planets){
        //for(double e : da){
        // for(int i = 0; i < da.length; i++){
        //     double e = da[i];
            System.out.println(e);
        }
    }
    
}
