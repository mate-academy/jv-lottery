package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int randomNumber = random.nextInt(colors.length);
        return colors[randomNumber].toString();
    }
}
