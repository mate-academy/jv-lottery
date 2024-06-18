package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int randomRange = 101;

    public Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(randomRange);

        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();

        Ball ball = new Ball();
        ball.setNumber(randomNumber);
        ball.setColour(color);

        return ball;
    }
}
