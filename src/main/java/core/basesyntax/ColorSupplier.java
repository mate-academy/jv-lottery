package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public enum Colors {
        RED,
        WHITE,
        GREEN,
        BLUE,
        BLACK,
        YELLOW,
        BROWN
    }

    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color.name();
    }
}
