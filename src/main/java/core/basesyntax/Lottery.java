package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final int LIMIT = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Ball ball = new Ball();

    public String getRandomBall() {
        int value = random.nextInt(LIMIT);
        String color = colorSupplier.getRandomColor();
        ball.setColor(color);
        ball.setNumber(value);
        return ball.toString();
    }
}
