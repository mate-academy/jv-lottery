package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        int randomIndex = random.nextInt(colors.length);
        return String.valueOf(colors[randomIndex]);
    }
}
