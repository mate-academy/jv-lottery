package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int numberOfBalls = 3;
        Ball[] balls = new Ball[numberOfBalls];
        Lottery lottery = new Lottery();
        for (Ball ball : balls) {
            ball = new Ball(lottery.getRandomBall());
            System.out.println(ball);
        }
    }
}
