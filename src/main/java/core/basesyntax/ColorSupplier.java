package core.basesyntax;

import java.util.Random;
import model.Colors;

public class ColorSupplier {
    private final Random rand = new Random();

    public String getRandomColor() {
        int index = rand.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];

        return color.name();
    }
}
