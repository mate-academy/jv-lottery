package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.name();
    }
}
