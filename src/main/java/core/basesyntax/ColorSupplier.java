package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private enum Color {
        Red,
        Green,
        Blue
    }

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Color.values().length);
        Color randomColor = Color.values()[index];
        return randomColor.name();
    }
}
