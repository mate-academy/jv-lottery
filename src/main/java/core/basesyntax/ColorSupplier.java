package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(ColorOfBalls.values().length);
        return ColorOfBalls.values()[index].toString();
    }
}
