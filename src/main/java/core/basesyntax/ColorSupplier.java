package core.basesyntax;

import java.util.Random;
import model.Colors;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors color = Colors.values()[index];

        return color.toString();
    }
}
