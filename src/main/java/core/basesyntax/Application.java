package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int Number_OfBalls = 3;
        Ball[] balls = new Ball[Number_OfBalls];
        for (Ball ball : balls) {
            Lottery lottery = new Lottery();
            ball = lottery.getRandomBall();
        }
    }
}
