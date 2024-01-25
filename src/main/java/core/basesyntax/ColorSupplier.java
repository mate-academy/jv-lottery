package core.basesyntax;

import java.util.Random;
import mypackage.Color;

public class ColorSupplier {
    public String getRandomColor() {
        int indexColor = new Random().nextInt(Color.values().length);
        Color color = Color.values()[indexColor];
        return String.valueOf(color);
    }
}
