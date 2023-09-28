package core.basesyntax;

public class Application {
    private static final int countOfBalls = 3;

    public static void main(String[] args) {
        Ball[] balls = new Ball[countOfBalls];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Lottery().getRandomBall();
            System.out.println("№" + (i + 1) + "-" + balls[i]);
        }

    }
}
