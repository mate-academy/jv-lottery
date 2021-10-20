package core.basesyntax;

public class Application {
    static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] arrayOfBalls = new Ball[NUMBER_OF_BALLS];
        for (Ball ball : arrayOfBalls) {
            ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
