public class IntroToArrays {
    public static void main(String[] args) {
        int [] nums = {75, 29, 350, 7, 204, 88, 67};
        
        int count = 0;
        int sumOfNums = 0;

        for(int i = 0; i < nums.length; i++ ){
            //count all numbers over 100
            if(nums[i] > 100){
                //System.out.println(nums[i]);
                count++;
            }
            //Add all numbers
            sumOfNums = sumOfNums + nums[i];
            
        }
        
        System.out.println("Number of values greater then 100: "+count);
        double mean = (double)sumOfNums / nums.length;
        System.out.println("Mean: " + mean);
    }
    
}
