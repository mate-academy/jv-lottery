package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        Color randomColor = colors[random.nextInt(colors.length)];
        return randomColor.name();
    }
}
