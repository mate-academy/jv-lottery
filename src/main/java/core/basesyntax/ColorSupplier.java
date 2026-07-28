package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();

    public String getRandomColor() {
        int colorAmount = Color.values().length;
        int index = random.nextInt(colorAmount);
        Color color = Color.values()[index];

        return color.name();
    }
}
