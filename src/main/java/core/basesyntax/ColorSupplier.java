package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Random random = new Random();
        int colorsCount = Color.values().length;
        return Color.values()[random.nextInt(colorsCount)].name();
    }
}
