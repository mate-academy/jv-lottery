package core.basesyntax;

public class Application {
    private static final int numberOfBalls = 3;

    public static void main(String[] args) {
        Ball[] randomBalls = new Ball[numberOfBalls];
        for (int i = 0; i < randomBalls.length; i++) {
            randomBalls[i] = Lottery.getRandomBall();
        }
        for (Ball ball: randomBalls) {
            System.out.println(ball);
        }
    }
}
