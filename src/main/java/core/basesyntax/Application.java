package core.basesyntax;

public class Application {
    private static final int BALL_NUMBER = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[BALL_NUMBER];
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALL_NUMBER; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
