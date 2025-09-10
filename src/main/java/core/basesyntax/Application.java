package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int BallsCount = 3;

        Lottery lottery = new Lottery();

        for (int i = 0; i < BallsCount; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
