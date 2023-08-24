package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball {
    private static final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.name();
    }
}
