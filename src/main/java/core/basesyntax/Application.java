package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int NumberOfBalls = 3;

        Lottery lottery = new Lottery();
        for (int i = 0; i < NumberOfBalls; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
