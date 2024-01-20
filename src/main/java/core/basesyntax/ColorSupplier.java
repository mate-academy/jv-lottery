package core.basesyntax;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random randomColor = new Random();

    public String getRandomColor() {
        int index = randomColor.nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.name().toLowerCase();
    }
}
