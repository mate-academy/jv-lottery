package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        return String.valueOf(Ball.Color.values()[new Random().nextInt(Ball.Color.values().length)]);
    }
}
