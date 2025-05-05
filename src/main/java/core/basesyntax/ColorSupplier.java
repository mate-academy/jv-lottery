package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int resultColor = random.nextInt(Color.values().length);
        return Color.values()[resultColor].name();
    }
}
