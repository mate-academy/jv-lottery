package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final ColorSupplier colorSupplier = new ColorSupplier();
    public static final Random random = new Random();
    public static final int MAX_AMOUNT = 100;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int num = random.nextInt(MAX_AMOUNT);

        return new Ball(color, num);
    }
}
