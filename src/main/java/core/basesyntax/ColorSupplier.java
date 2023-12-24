package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        Color[] values = Color.values();
        int randomIndex = random.nextInt(values.length);
        Color randomColor = values[randomIndex];
        return randomColor.name();
    }
}
