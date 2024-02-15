package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        Color randomColor = Color.values()[random.nextInt(Color.values().length)];
        return randomColor.name();
    }
}
