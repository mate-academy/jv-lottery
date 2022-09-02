package core.basesyntax;

import models.Colour;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = new Random().nextInt(Colour.values().length);
        return String.valueOf(Colour.values()[index]);
    }
}
