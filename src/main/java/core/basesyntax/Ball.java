package core.basesyntax;

import java.util.Random;

public class Ball {
    private final Color color;
    private final int number;
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Ball() {
        this.color = COLOR_SUPPLIER.getRandomColor();
        this.number = RANDOM.nextInt(100);
    }

    @Override
    public String toString() {
        return "Ball{" + "color='" + color + '\'' + ", number=" + number + '}';
    }
}