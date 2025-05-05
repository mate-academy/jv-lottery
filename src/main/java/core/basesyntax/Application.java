package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        int numberOfBalls = 3;

        for (int i = 0; i < numberOfBalls; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
