package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    public String getRandomColor() {
        Color color = Color.values()[random.nextInt(Color.values().length)];
        return color.name();
    }
}
