public class ChallengeWhileEx1 {
    public static void main(String[] args) {
        for(int i = 89; i <= 117; i++){
            System.out.println(i);
        }

        System.out.println("--------------------");

        int count = 1;
        for(int i = 1; i <= 40; i++){
            System.out.println(i);
            if(count == 3){
                System.out.println("Quack");
                count = 0;
            }
            count++;
        }
    }
    
    
}
