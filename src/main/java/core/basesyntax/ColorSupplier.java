package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomColor = new Random().nextInt(Colors.values().length);
        Colors colors = Colors.values()[randomColor];
        return colors.toString();
    }
}
