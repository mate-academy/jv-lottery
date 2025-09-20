package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int amountOfColors = Color.values().length;
        int index = random.nextInt(amountOfColors);
        Color color = Color.values()[index];
        return color.name();
    }
}
