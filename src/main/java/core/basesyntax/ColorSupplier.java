package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] colors = Color.values();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].name();
    }
}
