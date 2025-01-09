package core.basesyntax;

import core.basesyntax.classes.Color;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
