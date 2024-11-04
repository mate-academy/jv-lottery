package mate.academy.supplier;

import java.util.Random;
import mate.academy.model.Color;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
