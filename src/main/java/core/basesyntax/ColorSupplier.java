package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        Color[] color = Color.values();
        int numberColor = random.nextInt(color.length);
        return color[numberColor].name();
    }
}
