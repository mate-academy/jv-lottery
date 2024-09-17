package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] colors = Color.values();

    public String getRandomColor() {
        Color randomColor = colors[random.nextInt(colors.length)];
        return randomColor.name();
    }
}
