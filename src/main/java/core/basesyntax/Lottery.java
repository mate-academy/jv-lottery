package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        String colorRandom = colorSupplier.getRandomColor();
        int number = random.nextInt(100);
        ball.setColor(colorRandom);
        ball.setNumber(number);
        return ball;
    }
}
