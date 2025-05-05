package core.basesyntax;

public class Application {
    private static int numberOfBalls = 3;

    public static void main(String[] args) {
        Lottery ball = new Lottery();
        for (int i = 0; i < numberOfBalls; i++) {
            System.out.println(ball.getRandomBall());
        }
    }
}
