package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public String getRandomColor() {
        int colorIndex = random.nextInt(Color.values().length);
        Color color = Color.values()[colorIndex];
        return color.name();
    }
}
