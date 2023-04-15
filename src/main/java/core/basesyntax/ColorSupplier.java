package core.basesyntax;

import java.util.Random;

public abstract class ColorSupplier {
    public String getRandomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)].toString();
    }

    public abstract String getRandomBall();
}
