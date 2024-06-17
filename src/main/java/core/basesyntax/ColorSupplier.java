package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Ball.Colors getRandomColor() {
        int index = new Random().nextInt(Ball.Colors.values().length);
        return Ball.Colors.values()[index];
    }
}
