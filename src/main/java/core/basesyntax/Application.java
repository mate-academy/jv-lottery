package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numberOfBalls = 3;
        Ball[] balls = new Ball[numberOfBalls];

        for (int i = 0; i < numberOfBalls; i++) {
            Lottery lottery = new Lottery();
            balls[i] = lottery.getRandomBall();
        }

        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }
}
