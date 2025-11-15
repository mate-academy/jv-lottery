package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(Color.values().length);
        Color randomColor = Color.values()[randomColorIndex];
        return randomColor.name();
    }
}
