package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color color;

    public String getRandomColor() {
        color = Color.values()[random.nextInt(Color.values().length)];
        return color.name();
    }
}
