package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index].toString();
    }
}
