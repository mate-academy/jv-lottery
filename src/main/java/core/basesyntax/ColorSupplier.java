package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Colors[] colors = Colors.values();
    private final Random randomColor = new Random();

    public String getRandomColor() {
        int colorsIndex = randomColor.nextInt(colors.length);
        return String.valueOf(colors[colorsIndex]);
    }
}
