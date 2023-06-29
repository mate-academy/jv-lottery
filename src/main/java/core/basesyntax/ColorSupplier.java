package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Colors [] colors = Colors.values();
        Random random = new Random();
        int number = random.nextInt(colors.length);
        return String.valueOf(colors[number]);
    }
}
