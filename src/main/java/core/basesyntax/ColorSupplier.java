package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color randomColor = Color.values()[index];
        return randomColor.name();
    }
}
