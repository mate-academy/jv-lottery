package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private DifferentColor[] colors = DifferentColor.values();

    public String getRandomColor() {
        int colorIndex = random.nextInt(colors.length);
        return colors[colorIndex].name();
    }
}
