package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int positionOfColor = new Random().nextInt(RainbowColors.values().length);
        return RainbowColors.values()[positionOfColor].toString();
    }
}
