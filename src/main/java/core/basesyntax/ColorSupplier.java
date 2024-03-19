package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        Colors randomColors = colors[random.nextInt(colors.length)];
        return randomColors.name();
    }
}
