package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        enum Color {
            Red, Black, Green
        }

        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];

        return String.valueOf(color);
    }
}
