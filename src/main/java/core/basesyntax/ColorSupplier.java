package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        int index = random.nextInt(colors.length);
        Colors color = colors[index];
        return color.name().toLowerCase();
    }
}
