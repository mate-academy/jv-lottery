package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        int valueOfEnumColors = 5;
        Colors color = colors[random.nextInt(valueOfEnumColors)];
        return color.name();
    }
}
