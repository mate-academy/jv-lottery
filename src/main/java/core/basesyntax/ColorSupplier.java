package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomColor = new Random();
        Colors[] colors = Colors.values();
        return colors[randomColor.nextInt(colors.length)].name();
    }
}
