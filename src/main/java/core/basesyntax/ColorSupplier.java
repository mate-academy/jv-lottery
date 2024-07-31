package core.basesyntax;

import ball.characteristics.Color;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
