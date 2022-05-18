package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colors = Colors.values();
        Random randomColor = new Random();
        return colors[randomColor.nextInt(colors.length)].toString();
    }
}
