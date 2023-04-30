package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public ColorSupplier() {
    }

    public String getRandomColor() {
        int index = (new Random()).nextInt(ColorSupplier.Colors.values().length);
        return ColorSupplier.Colors.values()[index].name();
    }

    public enum Colors {
        BLUE,
        RED,
        GREEN,
        PINK,
        YELLOW
    }
}

