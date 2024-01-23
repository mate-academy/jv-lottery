package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;
    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        int index = random.nextInt(Ball.Color.values().length);
        return Ball.Color.values()[index].toString();
    }
}

