package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] color = Color.values();
        Color randomColors = color[random.nextInt(color.length)];
        return randomColors.name();
    }
}
