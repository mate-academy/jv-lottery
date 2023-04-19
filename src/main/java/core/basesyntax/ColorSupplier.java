package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index].toString();
    }

}
