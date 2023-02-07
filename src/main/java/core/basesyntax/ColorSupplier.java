package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors [] colors = Colors.values();

    public String getRandomColor() {
        Random random = new Random();
        return String.valueOf(colors[random.nextInt(colors.length - 1)]);
    }
}
