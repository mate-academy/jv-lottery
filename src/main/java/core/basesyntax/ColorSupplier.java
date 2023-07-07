package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    public Color getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
