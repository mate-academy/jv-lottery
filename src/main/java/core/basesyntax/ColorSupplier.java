package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int colorAmount = Color.values().length;
        int index = random.nextInt(colorAmount);

        return Color.values()[index].name();
    }
}
