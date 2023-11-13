package core.basesyntax;

import java.util.Random;

public class Ball {
    private final Color color;
    private final int number;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball() {
        this.color = colorSupplier.getRandomColor();
        this.number = random.nextInt(100);
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}