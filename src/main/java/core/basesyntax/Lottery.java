package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static final ColorSupplier colorSupplier = new ColorSupplier();
    public static final Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int num = random.nextInt(100);

        return new Ball(color, num);
    }
}
