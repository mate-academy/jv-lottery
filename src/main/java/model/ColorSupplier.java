package model;

import enums.Colors;
import java.util.Random;

public class ColorSupplier {
    public static Colors getRandomColor() {
        Colors[] colors = Colors.values();

        return colors[new Random().nextInt(colors.length)];
    }
}
