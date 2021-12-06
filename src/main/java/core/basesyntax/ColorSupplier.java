package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorSupplier() {
    }

    public String getRandomColor() {
        int indexOfColor = new Random().nextInt(ColorsEnum.values().length);
        return ColorsEnum.values()[indexOfColor].toString();
    }
}
