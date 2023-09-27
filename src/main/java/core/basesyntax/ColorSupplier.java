package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        Color randColor = colors[randomIndex];
        return randColor.toString();
    }
}
