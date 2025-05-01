package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        Color[] colors = Color.values();
        Color randomColor = colors[random.nextInt(colors.length)];
        return randomColor.name();
    }
}
