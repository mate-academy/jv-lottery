package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Colors[] colorArr = Colors.values();

    public Colors getRandomColor() {
        int colorIndex = random.nextInt(colorArr.length);

        return colorArr[colorIndex];
    }
}
