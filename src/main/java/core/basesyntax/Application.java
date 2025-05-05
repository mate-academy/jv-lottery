package core.basesyntax;

public class Application {
    public static final int COUNT_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[COUNT_BALLS];
        for (Ball ball : balls) {
            ball = lottery.getRandomBall();
        }
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
