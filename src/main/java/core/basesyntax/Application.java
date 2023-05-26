package core.basesyntax;

public class Application {

    private static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[BALLS_NUMBER];
        for (int i = 0; i < BALLS_NUMBER; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
