package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        printBalls(lottery, NUMBER_OF_BALLS);
    }

    private static void printBalls(Lottery lottery, int numberOfBalls) {
        for (int i = 0; i < numberOfBalls; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
