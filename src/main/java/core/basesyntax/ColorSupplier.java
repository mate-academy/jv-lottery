package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex].toString();
    }
}
