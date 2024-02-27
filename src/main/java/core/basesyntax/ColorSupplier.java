package main.java.core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors colors = Colors.values()[index];
        return String.valueOf(colors);
    }
}
