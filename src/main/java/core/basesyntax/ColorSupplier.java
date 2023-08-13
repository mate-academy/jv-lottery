package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    public static Colors getRandomColor() {
        Colors[] colors = Colors.values();
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex];
    }
}
