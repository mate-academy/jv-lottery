package core.basesyntax;

import java.util.Random;
import model.Color;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        Color color = Color.values()[index];

        return color.name();
    }
}
