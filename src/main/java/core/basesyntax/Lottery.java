package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();

        Colors color = colorSupplier.getRandomColor();

        int number = random.nextInt(100 + 1);

        ball.setColor(color);
        ball.setNumber(number);

        return ball;
    }

}
