package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Color {
        RED,
        GREEN,
        BLACK,
        WHITE,
        PURPLE,
        GREY;
    }

    public static String getRandomColor() {
        Random random = new Random();
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];

        return color.toString();
    }
}
