package mate.academy.supplier;

import java.util.Random;
import mate.academy.model.Color;

public class ColorSupplier {
    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}
