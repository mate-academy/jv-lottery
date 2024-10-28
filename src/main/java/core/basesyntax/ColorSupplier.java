package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int randomColorIndex = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        Color randomColor = Color.values()[randomColorIndex];
        return randomColor.name();
    }
}
