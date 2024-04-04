package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALLS_COUNT = 10;
    private static final int MAX_BALL_NUMBER = 100;

    public static void main(String[] args) {
        for (int i = 0; i < BALLS_COUNT; i++) {
            Ball ball = getRandomBall();
            System.out.println(ball);
            System.out.println();
        }
    }

    private static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();

        Random random = new Random();
        int number = random.nextInt(MAX_BALL_NUMBER - 1) + 1;

        return new Ball(number, colorSupplier.getRandomColor());
    }
}
