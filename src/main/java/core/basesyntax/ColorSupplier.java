package core.basesyntax;

import core.basesyntax.classes.Color;
import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.toString();
    }
}
