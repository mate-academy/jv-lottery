package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Ball[] randomBalls = new Ball[NUMBER_OF_BALLS];
        Lottery lottery = new Lottery();

        for (int i = 0; i < randomBalls.length; i++) {
            randomBalls[i] = lottery.getRandomBall();
        }
        for (Ball ball: randomBalls) {
            System.out.println(ball);
        }
    }
}
