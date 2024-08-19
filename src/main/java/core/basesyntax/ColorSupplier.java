package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] colorArr = Color.values();

    public String getRandomColor() {
        int colorIndex = random.nextInt(colorArr.length);

        return colorArr[colorIndex].name();
    }
}
