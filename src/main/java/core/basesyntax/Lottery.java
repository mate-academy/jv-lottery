package core.basesyntax;

import ball.characteristics.Ball;
import java.util.Random;

public class Lottery {
    public static final int border = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNum = random.nextInt(border);
        String color = colorSupplier.getRandomColor();
        return new Ball(randomNum, color);
    }
}
