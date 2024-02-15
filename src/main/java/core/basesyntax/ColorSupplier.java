package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int randomNumber = random.nextInt(colors.length);
        return colors[randomNumber].name();
    }
}
