public class MethodChalange {
    public static void main(String [] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Mario", highScorePosition);

        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Mike", highScorePosition);

        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Jason", highScorePosition);

        highScorePosition = calculateHighScorePosition(-1000);
        displayHighScorePosition("Andy", highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore) {
        int score = 4;
        if(playerScore >= 1000){
            score = 1;
        }else if(playerScore >= 500) {
            score =  2;
        }else if(playerScore >= 100){
            score = 3;
        }
        return score;
    }
}
