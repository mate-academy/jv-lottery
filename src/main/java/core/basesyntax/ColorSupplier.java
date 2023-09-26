package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = Color.values();

    public String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)].name();
    }
}
