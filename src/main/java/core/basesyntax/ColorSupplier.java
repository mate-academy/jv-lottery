package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random randomColor = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int randomIndex = randomColor.nextInt(colors.length);
        return colors[randomIndex].name();
    }
}
