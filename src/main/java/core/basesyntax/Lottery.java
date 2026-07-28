package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_LOTTERY_NUMBER = 100;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();

        String ballColor = colorSupplier.getRandomColor();
        ball.setColor(ballColor);

        int ballNumber = random.nextInt(MAX_LOTTERY_NUMBER + 1);
        ball.setNumber(ballNumber);

        return ball;
    }
}
