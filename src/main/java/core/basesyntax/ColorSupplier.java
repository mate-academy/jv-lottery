package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Colors getRandomColor() {
        Random random = new Random();
        Colors[] color = Colors.values();
        int randomIndex = random.nextInt(color.length);

        return color[randomIndex];
    }
}
