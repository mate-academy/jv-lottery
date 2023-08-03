package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Color[] colors = Color.values();
    int randomIndex = new Random().nextInt(colors.length);

    public String getRandomColor() {
        return colors[randomIndex].toString();
    }
}
