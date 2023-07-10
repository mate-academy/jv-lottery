package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        if (colors.length == 0) {
            throw new IllegalStateException("No colors defined");
        }
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
