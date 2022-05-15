package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color randomColor = Color.values()[random.nextInt(Color.values().length)];
        return String.valueOf(randomColor);
    }
}
