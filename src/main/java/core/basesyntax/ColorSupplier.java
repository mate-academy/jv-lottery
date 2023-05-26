package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(BallColor.values().length);
        return String.valueOf(BallColor.values()[index]);
    }
}

