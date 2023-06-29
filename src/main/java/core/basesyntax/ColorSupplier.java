package core.basesyntax;

import core.basesyntax.Ball.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColorIndex = new Random().nextInt(Color.values().length);
        Color color = Color.values()[randomColorIndex];
        return color.name();
    }
}
