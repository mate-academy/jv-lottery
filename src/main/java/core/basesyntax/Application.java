package core.basesyntax;

public class Application {
    private static final int countOfBalls = 3;

    public static void main(String[] args) {
        Lottery ball = new Lottery();
        ball.getRandomBall();
        for (int i = 0; i < countOfBalls; i++) {
            System.out.println(ball.getRandomBall());
        }

    }
}
