package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Ball.Colors getRandomColor() {
        return Ball.Colors.values()[new Random().nextInt(Ball.Colors.values().length)];
    }
}
