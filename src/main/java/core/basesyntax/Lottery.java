package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static final int MY_CONSTANT = 100;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        int number = random.nextInt(MY_CONSTANT);
        String color = String.valueOf(colorSupplier.getRandomColor());
        return new Ball(color, number);
    }
}
