package core.basesyntax;

public class Application {
    private static final int MAX_BALL_AMOUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[MAX_BALL_AMOUNT];
        for (int i = 0; i < MAX_BALL_AMOUNT; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
