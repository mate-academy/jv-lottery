package core.basesyntax;


import java.util.Random;


public class ColorSupplier {
    public static Color getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }
}