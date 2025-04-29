package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final int lengthColors = Color.values().length;

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(lengthColors);
        Color randomColor = Color.values()[randomColorIndex];

        return randomColor.name();
    }

}
