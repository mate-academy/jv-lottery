package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int randomNumber = new Random().nextInt(colors.length);
        return colors[randomNumber].toString();
    }
}
