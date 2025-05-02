package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    String getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index].name();
    }
}
