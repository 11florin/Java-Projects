public class ChallengeArrayEx2 {
    public static void main(String[] args) {
        // int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        // for(int i = 0; i <= 20 - 1; i++){
        //     System.out.println(num[i]);
        // }
        // System.out.println("--------------------");
        // for(int i = 20 - 1; i >= 0; i--){
        //     System.out.println(num[i]);
        // }

        int[] intArray = new int[20];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i + 1;
            //System.out.print(", " + intArray[i]);
        }
        for(int i = intArray.length - 1; i >= 0; i--){
            System.out.print(", " + intArray[i]);
        }
    }
    
}
