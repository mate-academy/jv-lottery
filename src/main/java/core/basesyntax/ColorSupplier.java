package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Color {
        Red, Black, Green
    }

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];

        return String.valueOf(color);
    }
}
