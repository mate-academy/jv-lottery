package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();

        Colors[] colors = Colors.values();

        return String.valueOf(colors[random.nextInt(colors.length)]);
    }
}
