package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] colors = Color.values();

    public String getRandomColor() {
        int randomNumberColor = random.nextInt(colors.length);
        return colors[randomNumberColor].toString();
    }
}
