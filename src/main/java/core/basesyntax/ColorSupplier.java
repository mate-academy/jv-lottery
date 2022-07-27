package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(BallColors.values().length);
        return String.valueOf(BallColors.values()[index]);
    }
}
