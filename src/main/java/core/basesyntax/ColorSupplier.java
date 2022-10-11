package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    static final int COLOR_NUMBER = 3;
    private final Random random = new Random();

    public Color getRandomColor() {
        int colorNumber = random.nextInt(COLOR_NUMBER);
        Color[] color = Color.values();
        return color[colorNumber];
    }
}

