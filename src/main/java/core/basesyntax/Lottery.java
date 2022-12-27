package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int range = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getRange() {
        return range;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();
        String colorRandom = colorSupplier.getRandomColor();
        int number = random.nextInt(getRange());
        ball.setColor(colorRandom);
        ball.setNumber(number);
        return ball;
    }
}
