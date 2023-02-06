package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random randomCollor = new Random();
        return Color.values()[randomCollor.nextInt(Color.values().length)];
    }
}
