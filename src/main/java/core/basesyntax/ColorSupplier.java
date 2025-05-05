package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index].name().toLowerCase();
    }
}
