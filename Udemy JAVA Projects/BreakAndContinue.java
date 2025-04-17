public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            if(i == 4){
                //break;
                continue; //will skip the 4
            }
            System.out.println(i);
        }
    }
}
