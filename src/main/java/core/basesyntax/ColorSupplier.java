package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int randomIndex = new Random().nextInt(colors.length);

        return colors[randomIndex].toString();
    }
}
