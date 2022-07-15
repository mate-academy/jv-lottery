package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(ColorsForBalls.values().length);
        return String.valueOf(ColorsForBalls.values()[index]);
    }
}

