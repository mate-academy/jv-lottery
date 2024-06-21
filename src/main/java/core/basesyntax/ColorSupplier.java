package core.basesyntax;

import core.basesyntax.enums.Color;

import java.util.Random;

public class ColorSupplier {
    int index = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return String.valueOf(Color.values()[index]);
    }
}
