package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int BALLS_COUNT = 3;
        Ball[] balls = new Ball[BALLS_COUNT];
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
