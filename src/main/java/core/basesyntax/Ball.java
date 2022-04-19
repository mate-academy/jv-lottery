package core.basesyntax;

import java.util.Random;

public class Ball extends ColorSupplier {
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();
    private int number = random.nextInt(100);

    public ColorSupplier getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}

