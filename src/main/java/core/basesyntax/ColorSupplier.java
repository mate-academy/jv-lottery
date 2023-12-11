package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private final int lengthEnum = 4;

    public String getRandomColor() {
        Color[] colors = Color.values();
        int i = random.nextInt(lengthEnum);
        return colors[i].toString();
    }
}
