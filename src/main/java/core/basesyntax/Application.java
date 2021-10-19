package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int NUMBER_OF_BALLS = 3;
        Ball[] balls = new Ball[NUMBER_OF_BALLS];
        for (Ball ball : balls) {
            Lottery lottery = new Lottery();
            ball = lottery.getRandomBall();
        }
    }
}
