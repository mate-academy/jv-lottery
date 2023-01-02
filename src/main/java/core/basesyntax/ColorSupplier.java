package core.basesyntax;

import core.basesyntax.Ball.Color;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] values = Color.values();
        int size = values.length;
        return String.valueOf(values[random.nextInt(size)]);
    }
}
