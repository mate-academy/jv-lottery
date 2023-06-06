package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    public static Color[] colors = Color.values();

    public String getRandomColor() {
        int randomNumber = random.nextInt(colors.length);
        return colors[randomNumber].toString();
    }
}
