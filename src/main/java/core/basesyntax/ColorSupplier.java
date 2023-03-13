package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomValue = new Random();
        int positionOfColor = randomValue.nextInt(RainbowColors.values().length);
        return RainbowColors.values()[positionOfColor].toString();
    }
}
