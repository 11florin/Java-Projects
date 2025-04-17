public class MainChalange {
    public static void main(String [] args) {

        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("The highScore is: " + highScore);
        score = 10000;
        levelComplete = 8;
        bonus = 200;

        System.out.println("The highScore is: " +
                calculateScore(true, 10000, 8, 200));

    }
    public static int calculateScore(boolean gameOver,int score, int levelComplete, int bonus) {


        int finalScore = score;

        if (gameOver) {//(gameOver == true)
            finalScore += (levelComplete * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

}
