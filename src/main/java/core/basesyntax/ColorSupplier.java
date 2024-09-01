package core.basesyntax;

import java.util.Random;
import model.Colors;

public class ColorSupplier {
    public String getRandomColor() {
        Random rand = new Random();
        int index = rand.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];

        return color.name();
    }
}
