package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Colors[] colors = Colors.values();
        int index = new Random().nextInt(colors.length);
        return colors[index].name();
    }
}