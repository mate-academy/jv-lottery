package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        Random randomCollor = new Random();
        return Color.values()[randomCollor.nextInt(Color.values().length)];
    }
}
