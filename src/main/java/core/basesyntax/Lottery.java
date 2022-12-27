package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    int range = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        String colorRandom = colorSupplier.getRandomColor();
        int number = random.nextInt(range);
        ball.setColor(colorRandom);
        ball.setNumber(number);
        return ball;
    }
}
